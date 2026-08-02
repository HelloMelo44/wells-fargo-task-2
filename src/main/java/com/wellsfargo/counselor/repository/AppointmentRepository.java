package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByCustomerCustomerId(Long customerId);

    List<Appointment> findByAdvisorAdvisorId(Long advisorId);
}