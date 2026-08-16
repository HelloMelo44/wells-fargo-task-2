package com.wellsfargo.counselor;

import com.wellsfargo.counselor.repository.AdvisorRepository;
import com.wellsfargo.counselor.repository.CustomerRepository;
import com.wellsfargo.counselor.repository.InvestmentProductRepository;
import com.wellsfargo.counselor.repository.PortfolioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RepositoryDataTests {

    @Autowired
    private AdvisorRepository advisorRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private InvestmentProductRepository investmentProductRepository;

    @Test
    void seedDataLoadsSuccessfully() {
        assertThat(advisorRepository.count()).isEqualTo(2);
        assertThat(customerRepository.count()).isEqualTo(3);
        assertThat(portfolioRepository.count()).isEqualTo(3);
        assertThat(investmentProductRepository.count()).isEqualTo(3);
    }
}