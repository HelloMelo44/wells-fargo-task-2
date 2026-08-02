package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.RiskProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiskProfileRepository extends JpaRepository<RiskProfile, Long> {
    List<RiskProfile> findByCustomerCustomerId(Long customerId);
}