package com.wellsfargo.counselor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PortfolioHoldingDto {

    private Long holdingId;
    private BigDecimal quantity;
    private BigDecimal purchasePrice;
    private BigDecimal currentValue;
    private LocalDate purchaseDate;
    private Long portfolioId;
    private String portfolioName;
    private Long productId;
    private String productName;
    private String productType;

    public PortfolioHoldingDto(
            Long holdingId,
            BigDecimal quantity,
            BigDecimal purchasePrice,
            BigDecimal currentValue,
            LocalDate purchaseDate,
            Long portfolioId,
            String portfolioName,
            Long productId,
            String productName,
            String productType
    ) {
        this.holdingId = holdingId;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.currentValue = currentValue;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
    }

    public Long getHoldingId() {
        return holdingId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
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

    public String getProductType() {
        return productType;
    }
}