package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.PortfolioTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioTransactionRepository extends JpaRepository<PortfolioTransaction, Long> {
    List<PortfolioTransaction> findByPortfolioPortfolioId(Long portfolioId);
}