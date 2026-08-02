package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.CustomerDto;
import com.wellsfargo.counselor.entity.Customer;
import com.wellsfargo.counselor.entity.FinancialGoal;
import com.wellsfargo.counselor.dto.PortfolioDto;
import com.wellsfargo.counselor.entity.RiskProfile;
import com.wellsfargo.counselor.repository.CustomerRepository;
import com.wellsfargo.counselor.repository.FinancialGoalRepository;
import com.wellsfargo.counselor.repository.PortfolioRepository;
import com.wellsfargo.counselor.repository.RiskProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final PortfolioRepository portfolioRepository;
    private final FinancialGoalRepository financialGoalRepository;
    private final RiskProfileRepository riskProfileRepository;

    public CustomerController(
            CustomerRepository customerRepository,
            PortfolioRepository portfolioRepository,
            FinancialGoalRepository financialGoalRepository,
            RiskProfileRepository riskProfileRepository
    ) {
        this.customerRepository = customerRepository;
        this.portfolioRepository = portfolioRepository;
        this.financialGoalRepository = financialGoalRepository;
        this.riskProfileRepository = riskProfileRepository;
    }

    @GetMapping
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<CustomerDto> getCustomerById(@PathVariable Long id) {
        return customerRepository.findById(id)
                .map(this::toDto);
    }

    @GetMapping("/{id}/portfolios")
public List<PortfolioDto> getCustomerPortfolios(@PathVariable Long id) {
    return portfolioRepository.findByCustomerCustomerId(id)
            .stream()
            .map(this::toPortfolioDto)
            .toList();
}

    @GetMapping("/{id}/financial-goals")
    public List<FinancialGoal> getCustomerFinancialGoals(@PathVariable Long id) {
        return financialGoalRepository.findByCustomerCustomerId(id);
    }

    @GetMapping("/{id}/risk-profiles")
    public List<RiskProfile> getCustomerRiskProfiles(@PathVariable Long id) {
        return riskProfileRepository.findByCustomerCustomerId(id);
    }

    private CustomerDto toDto(Customer customer) {
        String advisorName = customer.getAdvisor().getFirstName() + " " + customer.getAdvisor().getLastName();

        return new CustomerDto(
                customer.getCustomerId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getDateOfBirth(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getEmploymentStatus(),
                customer.getAnnualIncome(),
                customer.getCustomerStatus(),
                customer.getAdvisor().getAdvisorId(),
                advisorName
        );
    }
private PortfolioDto toPortfolioDto(com.wellsfargo.counselor.entity.Portfolio portfolio) {
    String customerName = portfolio.getCustomer().getFirstName() + " " + portfolio.getCustomer().getLastName();

    return new PortfolioDto(
            portfolio.getPortfolioId(),
            portfolio.getPortfolioName(),
            portfolio.getPortfolioType(),
            portfolio.getCreatedDate(),
            portfolio.getTotalValue(),
            portfolio.getPortfolioStatus(),
            portfolio.getCustomer().getCustomerId(),
            customerName
    );
}
}