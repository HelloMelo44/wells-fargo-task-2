package com.wellsfargo.counselor.dto;

import java.time.LocalDate;

public class RiskProfileDto {

    private Long riskProfileId;
    private String riskLevel;
    private String investmentExperience;
    private String timeHorizon;
    private String liquidityNeeds;
    private LocalDate assessmentDate;
    private Long customerId;
    private String customerName;

    public RiskProfileDto(
            Long riskProfileId,
            String riskLevel,
            String investmentExperience,
            String timeHorizon,
            String liquidityNeeds,
            LocalDate assessmentDate,
            Long customerId,
            String customerName
    ) {
        this.riskProfileId = riskProfileId;
        this.riskLevel = riskLevel;
        this.investmentExperience = investmentExperience;
        this.timeHorizon = timeHorizon;
        this.liquidityNeeds = liquidityNeeds;
        this.assessmentDate = assessmentDate;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Long getRiskProfileId() {
        return riskProfileId;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getInvestmentExperience() {
        return investmentExperience;
    }

    public String getTimeHorizon() {
        return timeHorizon;
    }

    public String getLiquidityNeeds() {
        return liquidityNeeds;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
}