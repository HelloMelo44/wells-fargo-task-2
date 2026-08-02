package com.wellsfargo.counselor.controller;

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
    public List<Recommendation> getAllRecommendations() {
        return recommendationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Recommendation> getRecommendationById(@PathVariable Long id) {
        return recommendationRepository.findById(id);
    }
}