package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.AppointmentDto;
import com.wellsfargo.counselor.entity.Appointment;
import com.wellsfargo.counselor.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping
    public List<AppointmentDto> getAllAppointments() {
        return appointmentRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<AppointmentDto> getAppointmentById(@PathVariable Long id) {
        return appointmentRepository.findById(id)
                .map(this::toDto);
    }

    private AppointmentDto toDto(Appointment appointment) {
        String advisorName = appointment.getAdvisor().getFirstName() + " " + appointment.getAdvisor().getLastName();
        String customerName = appointment.getCustomer().getFirstName() + " " + appointment.getCustomer().getLastName();

        return new AppointmentDto(
                appointment.getAppointmentId(),
                appointment.getAppointmentDate(),
                appointment.getMeetingType(),
                appointment.getMeetingNotes(),
                appointment.getAppointmentStatus(),
                appointment.getAdvisor().getAdvisorId(),
                advisorName,
                appointment.getCustomer().getCustomerId(),
                customerName
        );
    }
}