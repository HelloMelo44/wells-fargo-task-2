package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.dto.InvestmentProductDto;
import com.wellsfargo.counselor.entity.InvestmentProduct;
import com.wellsfargo.counselor.repository.InvestmentProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/investment-products")
public class InvestmentProductController {

    private final InvestmentProductRepository investmentProductRepository;

    public InvestmentProductController(InvestmentProductRepository investmentProductRepository) {
        this.investmentProductRepository = investmentProductRepository;
    }

    @GetMapping
    public List<InvestmentProductDto> getAllInvestmentProducts() {
        return investmentProductRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<InvestmentProductDto> getInvestmentProductById(@PathVariable Long id) {
        return investmentProductRepository.findById(id)
                .map(this::toDto);
    }

    private InvestmentProductDto toDto(InvestmentProduct product) {
        return new InvestmentProductDto(
                product.getProductId(),
                product.getProductName(),
                product.getProductType(),
                product.getProvider(),
                product.getRiskRating(),
                product.getExpectedReturn(),
                product.getMinimumInvestment(),
                product.getProductStatus()
        );
    }
}