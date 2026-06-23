package com.wellsfargo.counselor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "investment_products")
public class InvestmentProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "provider")
    private String provider;

    @Column(name = "risk_rating")
    private String riskRating;

    @Column(name = "expected_return")
    private BigDecimal expectedReturn;

    @Column(name = "minimum_investment")
    private BigDecimal minimumInvestment;

    @Column(name = "product_status")
    private String productStatus;

    public InvestmentProduct() {
    }

    public InvestmentProduct(String productName, String productType, String provider,
                             String riskRating, BigDecimal expectedReturn,
                             BigDecimal minimumInvestment, String productStatus) {
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

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(String riskRating) {
        this.riskRating = riskRating;
    }

    public BigDecimal getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(BigDecimal expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    public BigDecimal getMinimumInvestment() {
        return minimumInvestment;
    }

    public void setMinimumInvestment(BigDecimal minimumInvestment) {
        this.minimumInvestment = minimumInvestment;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
}