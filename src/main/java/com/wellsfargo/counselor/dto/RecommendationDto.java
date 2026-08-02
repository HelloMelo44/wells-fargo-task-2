package com.wellsfargo.counselor.dto;

import java.time.LocalDate;

public class RecommendationDto {

    private Long recommendationId;
    private LocalDate recommendationDate;
    private String recommendationReason;
    private String recommendationStatus;
    private Long advisorId;
    private String advisorName;
    private Long customerId;
    private String customerName;
    private Long productId;
    private String productName;

    public RecommendationDto(
            Long recommendationId,
            LocalDate recommendationDate,
            String recommendationReason,
            String recommendationStatus,
            Long advisorId,
            String advisorName,
            Long customerId,
            String customerName,
            Long productId,
            String productName
    ) {
        this.recommendationId = recommendationId;
        this.recommendationDate = recommendationDate;
        this.recommendationReason = recommendationReason;
        this.recommendationStatus = recommendationStatus;
        this.advisorId = advisorId;
        this.advisorName = advisorName;
        this.customerId = customerId;
        this.customerName = customerName;
        this.productId = productId;
        this.productName = productName;
    }

    public Long getRecommendationId() {
        return recommendationId;
    }

    public LocalDate getRecommendationDate() {
        return recommendationDate;
    }

    public String getRecommendationReason() {
        return recommendationReason;
    }

    public String getRecommendationStatus() {
        return recommendationStatus;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}