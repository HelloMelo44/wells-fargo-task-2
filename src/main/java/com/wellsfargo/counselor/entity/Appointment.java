package com.wellsfargo.counselor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long appointmentId;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;

    @Column(name = "meeting_type")
    private String meetingType;

    @Column(name = "meeting_notes")
    private String meetingNotes;

    @Column(name = "appointment_status")
    private String appointmentStatus;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Appointment() {
    }

    public Appointment(LocalDateTime appointmentDate, String meetingType,
                       String meetingNotes, String appointmentStatus,
                       Advisor advisor, Customer customer) {
        this.appointmentDate = appointmentDate;
        this.meetingType = meetingType;
        this.meetingNotes = meetingNotes;
        this.appointmentStatus = appointmentStatus;
        this.advisor = advisor;
        this.customer = customer;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public void setMeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}