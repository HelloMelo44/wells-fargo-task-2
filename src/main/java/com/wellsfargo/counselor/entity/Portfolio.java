package com.wellsfargo.counselor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private Long portfolioId;

    @Column(name = "portfolio_name")
    private String portfolioName;

    @Column(name = "portfolio_type")
    private String portfolioType;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "total_value")
    private BigDecimal totalValue;

    @Column(name = "portfolio_status")
    private String portfolioStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Portfolio() {
    }

    public Portfolio(String portfolioName, String portfolioType, LocalDate createdDate,
                     BigDecimal totalValue, String portfolioStatus, Customer customer) {
        this.portfolioName = portfolioName;
        this.portfolioType = portfolioType;
        this.createdDate = createdDate;
        this.totalValue = totalValue;
        this.portfolioStatus = portfolioStatus;
        this.customer = customer;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public String getPortfolioStatus() {
        return portfolioStatus;
    }

    public void setPortfolioStatus(String portfolioStatus) {
        this.portfolioStatus = portfolioStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}