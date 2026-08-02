package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.AdvisorDto;
import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/advisors")
public class AdvisorController {

    private final AdvisorRepository advisorRepository;

    public AdvisorController(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    @GetMapping
    public List<AdvisorDto> getAllAdvisors() {
        return advisorRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<AdvisorDto> getAdvisorById(@PathVariable Long id) {
        return advisorRepository.findById(id)
                .map(this::toDto);
    }

    private AdvisorDto toDto(Advisor advisor) {
        return new AdvisorDto(
                advisor.getAdvisorId(),
                advisor.getFirstName(),
                advisor.getLastName(),
                advisor.getEmail(),
                advisor.getPhone()
        );
    }
}