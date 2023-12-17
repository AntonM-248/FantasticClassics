package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.CustomerRepository;
import com.classic_cars.classics.repository.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductLineService {
    @Autowired
    private ProductLineRepository productLineRepository;

    public ProductLineRepository getProductLineRepository() {
        return this.productLineRepository;
    }
}
