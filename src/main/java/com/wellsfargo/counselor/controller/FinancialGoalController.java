package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.FinancialGoal;
import com.wellsfargo.counselor.repository.FinancialGoalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/financial-goals")
public class FinancialGoalController {

    private final FinancialGoalRepository financialGoalRepository;

    public FinancialGoalController(FinancialGoalRepository financialGoalRepository) {
        this.financialGoalRepository = financialGoalRepository;
    }

    @GetMapping
    public List<FinancialGoal> getAllFinancialGoals() {
        return financialGoalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FinancialGoal> getFinancialGoalById(@PathVariable Long id) {
        return financialGoalRepository.findById(id);
    }
}