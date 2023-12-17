package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderRepository getOrderRepository() {
        return this.orderRepository;
    }
}
