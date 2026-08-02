package com.wellsfargo.counselor.dto;

import java.time.LocalDateTime;

public class AppointmentDto {

    private Long appointmentId;
    private LocalDateTime appointmentDate;
    private String meetingType;
    private String meetingNotes;
    private String appointmentStatus;
    private Long advisorId;
    private String advisorName;
    private Long customerId;
    private String customerName;

    public AppointmentDto(
            Long appointmentId,
            LocalDateTime appointmentDate,
            String meetingType,
            String meetingNotes,
            String appointmentStatus,
            Long advisorId,
            String advisorName,
            Long customerId,
            String customerName
    ) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.meetingType = meetingType;
        this.meetingNotes = meetingNotes;
        this.appointmentStatus = appointmentStatus;
        this.advisorId = advisorId;
        this.advisorName = advisorName;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
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
}