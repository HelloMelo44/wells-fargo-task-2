package com.wellsfargo.counselor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PortfolioDto {

    private Long portfolioId;
    private String portfolioName;
    private String portfolioType;
    private LocalDate createdDate;
    private BigDecimal totalValue;
    private String portfolioStatus;
    private Long customerId;
    private String customerName;

    public PortfolioDto(
            Long portfolioId,
            String portfolioName,
            String portfolioType,
            LocalDate createdDate,
            BigDecimal totalValue,
            String portfolioStatus,
            Long customerId,
            String customerName
    ) {
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
        this.portfolioType = portfolioType;
        this.createdDate = createdDate;
        this.totalValue = totalValue;
        this.portfolioStatus = portfolioStatus;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public String getPortfolioStatus() {
        return portfolioStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
}