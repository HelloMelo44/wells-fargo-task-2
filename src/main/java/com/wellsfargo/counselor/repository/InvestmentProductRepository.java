package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.InvestmentProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentProductRepository extends JpaRepository<InvestmentProduct, Long> {
}