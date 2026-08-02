package com.wellsfargo.counselor.dto;

public class AdvisorDto {

    private Long advisorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public AdvisorDto(Long advisorId, String firstName, String lastName, String email, String phone) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}