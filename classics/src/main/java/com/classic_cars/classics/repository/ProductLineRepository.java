package com.classic_cars.classics.repository;

import com.classic_cars.classics.model.ProductLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine, String> {
}
