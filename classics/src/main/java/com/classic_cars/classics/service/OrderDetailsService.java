package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsRepository getOrderDetailsRepository() {
        return this.orderDetailsRepository;
    }
}
