package com.classic_cars.classics.controller;

import com.classic_cars.classics.model.Payment;
import com.classic_cars.classics.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/all")
    public ResponseEntity<List<Payment>> getAllPayments(){
        return new ResponseEntity<>(paymentService.getPaymentRepository().findAll(), HttpStatus.OK);
    }
}
