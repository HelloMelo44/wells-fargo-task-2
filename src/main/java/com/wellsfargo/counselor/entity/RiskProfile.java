package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "risk_profiles")
public class RiskProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "risk_profile_id")
    private Long riskProfileId;

    @Column(name = "risk_level")
    private String riskLevel;

    @Column(name = "investment_experience")
    private String investmentExperience;

    @Column(name = "time_horizon")
    private String timeHorizon;

    @Column(name = "liquidity_needs")
    private String liquidityNeeds;

    @Column(name = "assessment_date")
    private LocalDate assessmentDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public RiskProfile() {
    }

    public RiskProfile(String riskLevel, String investmentExperience, String timeHorizon,
                       String liquidityNeeds, LocalDate assessmentDate, Customer customer) {
        this.riskLevel = riskLevel;
        this.investmentExperience = investmentExperience;
        this.timeHorizon = timeHorizon;
        this.liquidityNeeds = liquidityNeeds;
        this.assessmentDate = assessmentDate;
        this.customer = customer;
    }

    public Long getRiskProfileId() {
        return riskProfileId;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getInvestmentExperience() {
        return investmentExperience;
    }

    public void setInvestmentExperience(String investmentExperience) {
        this.investmentExperience = investmentExperience;
    }

    public String getTimeHorizon() {
        return timeHorizon;
    }

    public void setTimeHorizon(String timeHorizon) {
        this.timeHorizon = timeHorizon;
    }

    public String getLiquidityNeeds() {
        return liquidityNeeds;
    }

    public void setLiquidityNeeds(String liquidityNeeds) {
        this.liquidityNeeds = liquidityNeeds;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}