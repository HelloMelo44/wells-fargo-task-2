package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.FinancialGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialGoalRepository extends JpaRepository<FinancialGoal, Long> {
    List<FinancialGoal> findByCustomerCustomerId(Long customerId);
}