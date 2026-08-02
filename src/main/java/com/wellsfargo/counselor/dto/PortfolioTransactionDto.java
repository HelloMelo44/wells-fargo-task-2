package com.wellsfargo.counselor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PortfolioTransactionDto {

    private Long transactionId;
    private String transactionType;
    private LocalDate transactionDate;
    private BigDecimal quantity;
    private BigDecimal amount;
    private String transactionStatus;
    private Long portfolioId;
    private String portfolioName;
    private Long productId;
    private String productName;

    public PortfolioTransactionDto(
            Long transactionId,
            String transactionType,
            LocalDate transactionDate,
            BigDecimal quantity,
            BigDecimal amount,
            String transactionStatus,
            Long portfolioId,
            String portfolioName,
            Long productId,
            String productName
    ) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.quantity = quantity;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
        this.productId = productId;
        this.productName = productName;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}