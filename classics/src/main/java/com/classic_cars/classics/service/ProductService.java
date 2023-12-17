package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductRepository getProductRepository(){
        return this.productRepository;
    }
}
