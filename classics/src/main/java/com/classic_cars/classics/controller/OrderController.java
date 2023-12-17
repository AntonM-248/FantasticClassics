package com.classic_cars.classics.controller;

import com.classic_cars.classics.model.Order;
import com.classic_cars.classics.service.OrderService;
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
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderService.getOrderRepository().findAll(), HttpStatus.OK);
    }
}
