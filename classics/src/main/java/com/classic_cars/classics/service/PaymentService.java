package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentRepository getPaymentRepository() {
        return this.paymentRepository;
    }
}
