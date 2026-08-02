package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.PortfolioDto;
import com.wellsfargo.counselor.entity.Portfolio;
import com.wellsfargo.counselor.entity.PortfolioHolding;
import com.wellsfargo.counselor.entity.PortfolioTransaction;
import com.wellsfargo.counselor.repository.PortfolioHoldingRepository;
import com.wellsfargo.counselor.repository.PortfolioRepository;
import com.wellsfargo.counselor.repository.PortfolioTransactionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {

    private final PortfolioRepository portfolioRepository;
    private final PortfolioHoldingRepository portfolioHoldingRepository;
    private final PortfolioTransactionRepository portfolioTransactionRepository;

    public PortfolioController(
            PortfolioRepository portfolioRepository,
            PortfolioHoldingRepository portfolioHoldingRepository,
            PortfolioTransactionRepository portfolioTransactionRepository
    ) {
        this.portfolioRepository = portfolioRepository;
        this.portfolioHoldingRepository = portfolioHoldingRepository;
        this.portfolioTransactionRepository = portfolioTransactionRepository;
    }

    @GetMapping
    public List<PortfolioDto> getAllPortfolios() {
        return portfolioRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<PortfolioDto> getPortfolioById(@PathVariable Long id) {
        return portfolioRepository.findById(id)
                .map(this::toDto);
    }

    @GetMapping("/{id}/holdings")
    public List<PortfolioHolding> getPortfolioHoldings(@PathVariable Long id) {
        return portfolioHoldingRepository.findByPortfolioPortfolioId(id);
    }

    @GetMapping("/{id}/transactions")
    public List<PortfolioTransaction> getPortfolioTransactions(@PathVariable Long id) {
        return portfolioTransactionRepository.findByPortfolioPortfolioId(id);
    }

    private PortfolioDto toDto(Portfolio portfolio) {
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