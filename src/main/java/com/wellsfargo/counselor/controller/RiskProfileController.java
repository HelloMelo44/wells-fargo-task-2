package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.RiskProfileDto;
import com.wellsfargo.counselor.entity.RiskProfile;
import com.wellsfargo.counselor.repository.RiskProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/risk-profiles")
public class RiskProfileController {

    private final RiskProfileRepository riskProfileRepository;

    public RiskProfileController(RiskProfileRepository riskProfileRepository) {
        this.riskProfileRepository = riskProfileRepository;
    }

    @GetMapping
    public List<RiskProfileDto> getAllRiskProfiles() {
        return riskProfileRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<RiskProfileDto> getRiskProfileById(@PathVariable Long id) {
        return riskProfileRepository.findById(id)
                .map(this::toDto);
    }

    private RiskProfileDto toDto(RiskProfile riskProfile) {
        String customerName = riskProfile.getCustomer().getFirstName() + " " + riskProfile.getCustomer().getLastName();

        return new RiskProfileDto(
                riskProfile.getRiskProfileId(),
                riskProfile.getRiskLevel(),
                riskProfile.getInvestmentExperience(),
                riskProfile.getTimeHorizon(),
                riskProfile.getLiquidityNeeds(),
                riskProfile.getAssessmentDate(),
                riskProfile.getCustomer().getCustomerId(),
                customerName
        );
    }
}