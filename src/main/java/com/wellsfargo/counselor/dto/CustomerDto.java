package com.wellsfargo.counselor.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CustomerDto {

    private Long customerId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private String employmentStatus;
    private BigDecimal annualIncome;
    private String customerStatus;
    private Long advisorId;
    private String advisorName;

    public CustomerDto(
            Long customerId,
            String firstName,
            String lastName,
            LocalDate dateOfBirth,
            String email,
            String phoneNumber,
            String employmentStatus,
            BigDecimal annualIncome,
            String customerStatus,
            Long advisorId,
            String advisorName
    ) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employmentStatus = employmentStatus;
        this.annualIncome = annualIncome;
        this.customerStatus = customerStatus;
        this.advisorId = advisorId;
        this.advisorName = advisorName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }
}