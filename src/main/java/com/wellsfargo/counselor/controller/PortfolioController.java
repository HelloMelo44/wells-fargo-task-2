package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.PortfolioDto;
import com.wellsfargo.counselor.dto.PortfolioHoldingDto;
import com.wellsfargo.counselor.dto.PortfolioTransactionDto;
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
                .map(this::toPortfolioDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<PortfolioDto> getPortfolioById(@PathVariable Long id) {
        return portfolioRepository.findById(id)
                .map(this::toPortfolioDto);
    }

    @GetMapping("/{id}/holdings")
    public List<PortfolioHoldingDto> getPortfolioHoldings(@PathVariable Long id) {
        return portfolioHoldingRepository.findByPortfolioPortfolioId(id)
                .stream()
                .map(this::toHoldingDto)
                .toList();
    }

    @GetMapping("/{id}/transactions")
    public List<PortfolioTransactionDto> getPortfolioTransactions(@PathVariable Long id) {
        return portfolioTransactionRepository.findByPortfolioPortfolioId(id)
                .stream()
                .map(this::toTransactionDto)
                .toList();
    }

    private PortfolioDto toPortfolioDto(Portfolio portfolio) {
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

    private PortfolioHoldingDto toHoldingDto(PortfolioHolding holding) {
        return new PortfolioHoldingDto(
                holding.getHoldingId(),
                holding.getQuantity(),
                holding.getPurchasePrice(),
                holding.getCurrentValue(),
                holding.getPurchaseDate(),
                holding.getPortfolio().getPortfolioId(),
                holding.getPortfolio().getPortfolioName(),
                holding.getProduct().getProductId(),
                holding.getProduct().getProductName(),
                holding.getProduct().getProductType()
        );
    }

    private PortfolioTransactionDto toTransactionDto(PortfolioTransaction transaction) {
        return new PortfolioTransactionDto(
                transaction.getTransactionId(),
                transaction.getTransactionType(),
                transaction.getTransactionDate(),
                transaction.getQuantity(),
                transaction.getAmount(),
                transaction.getTransactionStatus(),
                transaction.getPortfolio().getPortfolioId(),
                transaction.getPortfolio().getPortfolioName(),
                transaction.getProduct().getProductId(),
                transaction.getProduct().getProductName()
        );
    }
}