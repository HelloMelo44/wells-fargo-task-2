package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findByCustomerCustomerId(Long customerId);

    List<Recommendation> findByAdvisorAdvisorId(Long advisorId);
}