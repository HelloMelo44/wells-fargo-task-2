package com.wellsfargo.counselor.controller;

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
    public List<InvestmentProduct> getAllInvestmentProducts() {
        return investmentProductRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<InvestmentProduct> getInvestmentProductById(@PathVariable Long id) {
        return investmentProductRepository.findById(id);
    }
}