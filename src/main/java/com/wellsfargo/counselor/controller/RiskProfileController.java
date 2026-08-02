package com.wellsfargo.counselor.controller;

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
    public List<RiskProfile> getAllRiskProfiles() {
        return riskProfileRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RiskProfile> getRiskProfileById(@PathVariable Long id) {
        return riskProfileRepository.findById(id);
    }
}