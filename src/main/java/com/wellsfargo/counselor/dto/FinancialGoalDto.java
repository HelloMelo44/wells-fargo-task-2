package com.wellsfargo.counselor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinancialGoalDto {

    private Long goalId;
    private String goalType;
    private BigDecimal targetAmount;
    private LocalDate targetDate;
    private String priority;
    private String goalStatus;
    private Long customerId;
    private String customerName;

    public FinancialGoalDto(
            Long goalId,
            String goalType,
            BigDecimal targetAmount,
            LocalDate targetDate,
            String priority,
            String goalStatus,
            Long customerId,
            String customerName
    ) {
        this.goalId = goalId;
        this.goalType = goalType;
        this.targetAmount = targetAmount;
        this.targetDate = targetDate;
        this.priority = priority;
        this.goalStatus = goalStatus;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Long getGoalId() {
        return goalId;
    }

    public String getGoalType() {
        return goalType;
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getGoalStatus() {
        return goalStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
}