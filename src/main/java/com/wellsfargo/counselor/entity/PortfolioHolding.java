package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "portfolio_holdings")
public class PortfolioHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "holding_id")
    private Long holdingId;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "purchase_price")
    private BigDecimal purchasePrice;

    @Column(name = "current_value")
    private BigDecimal currentValue;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private InvestmentProduct product;

    public PortfolioHolding() {
    }

    public PortfolioHolding(BigDecimal quantity, BigDecimal purchasePrice,
                            BigDecimal currentValue, LocalDate purchaseDate,
                            Portfolio portfolio, InvestmentProduct product) {
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.currentValue = currentValue;
        this.purchaseDate = purchaseDate;
        this.portfolio = portfolio;
        this.product = product;
    }

    public Long getHoldingId() {
        return holdingId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public InvestmentProduct getProduct() {
        return product;
    }

    public void setProduct(InvestmentProduct product) {
        this.product = product;
    }
}