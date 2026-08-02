package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Customer;
import com.wellsfargo.counselor.entity.FinancialGoal;
import com.wellsfargo.counselor.entity.Portfolio;
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
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerRepository.findById(id);
    }

    @GetMapping("/{id}/portfolios")
    public List<Portfolio> getCustomerPortfolios(@PathVariable Long id) {
        return portfolioRepository.findByCustomerCustomerId(id);
    }

    @GetMapping("/{id}/financial-goals")
    public List<FinancialGoal> getCustomerFinancialGoals(@PathVariable Long id) {
        return financialGoalRepository.findByCustomerCustomerId(id);
    }

    @GetMapping("/{id}/risk-profiles")
    public List<RiskProfile> getCustomerRiskProfiles(@PathVariable Long id) {
        return riskProfileRepository.findByCustomerCustomerId(id);
    }
}