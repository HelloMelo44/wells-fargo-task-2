package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.RecommendationDto;
import com.wellsfargo.counselor.entity.Recommendation;
import com.wellsfargo.counselor.repository.RecommendationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommendationRepository recommendationRepository;

    public RecommendationController(RecommendationRepository recommendationRepository) {
        this.recommendationRepository = recommendationRepository;
    }

    @GetMapping
    public List<RecommendationDto> getAllRecommendations() {
        return recommendationRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<RecommendationDto> getRecommendationById(@PathVariable Long id) {
        return recommendationRepository.findById(id)
                .map(this::toDto);
    }

    private RecommendationDto toDto(Recommendation recommendation) {
        String advisorName = recommendation.getAdvisor().getFirstName() + " " + recommendation.getAdvisor().getLastName();
        String customerName = recommendation.getCustomer().getFirstName() + " " + recommendation.getCustomer().getLastName();

        return new RecommendationDto(
                recommendation.getRecommendationId(),
                recommendation.getRecommendationDate(),
                recommendation.getRecommendationReason(),
                recommendation.getRecommendationStatus(),
                recommendation.getAdvisor().getAdvisorId(),
                advisorName,
                recommendation.getCustomer().getCustomerId(),
                customerName,
                recommendation.getProduct().getProductId(),
                recommendation.getProduct().getProductName()
        );
    }
}