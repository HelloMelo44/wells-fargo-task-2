package com.wellsfargo.counselor.dto;

import java.math.BigDecimal;

public class InvestmentProductDto {

    private Long productId;
    private String productName;
    private String productType;
    private String provider;
    private String riskRating;
    private BigDecimal expectedReturn;
    private BigDecimal minimumInvestment;
    private String productStatus;

    public InvestmentProductDto(
            Long productId,
            String productName,
            String productType,
            String provider,
            String riskRating,
            BigDecimal expectedReturn,
            BigDecimal minimumInvestment,
            String productStatus
    ) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.provider = provider;
        this.riskRating = riskRating;
        this.expectedReturn = expectedReturn;
        this.minimumInvestment = minimumInvestment;
        this.productStatus = productStatus;
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

    public String getProvider() {
        return provider;
    }

    public String getRiskRating() {
        return riskRating;
    }

    public BigDecimal getExpectedReturn() {
        return expectedReturn;
    }

    public BigDecimal getMinimumInvestment() {
        return minimumInvestment;
    }

    public String getProductStatus() {
        return productStatus;
    }
}