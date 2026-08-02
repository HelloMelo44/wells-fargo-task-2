package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.FinancialGoalDto;
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
    public List<FinancialGoalDto> getAllFinancialGoals() {
        return financialGoalRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<FinancialGoalDto> getFinancialGoalById(@PathVariable Long id) {
        return financialGoalRepository.findById(id)
                .map(this::toDto);
    }

    private FinancialGoalDto toDto(FinancialGoal goal) {
        String customerName = goal.getCustomer().getFirstName() + " " + goal.getCustomer().getLastName();

        return new FinancialGoalDto(
                goal.getGoalId(),
                goal.getGoalType(),
                goal.getTargetAmount(),
                goal.getTargetDate(),
                goal.getPriority(),
                goal.getGoalStatus(),
                goal.getCustomer().getCustomerId(),
                customerName
        );
    }
}