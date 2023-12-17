package com.classic_cars.classics.controller;

import com.classic_cars.classics.model.OrderDetails;
import com.classic_cars.classics.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {
    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/all")
    public ResponseEntity<List<OrderDetails>> getAllOrderDetails(){
        return new ResponseEntity<>(orderDetailsService.getOrderDetailsRepository().findAll(), HttpStatus.OK);
    }
}
