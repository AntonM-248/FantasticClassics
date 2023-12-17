package com.classic_cars.classics.controller;

import com.classic_cars.classics.model.Customer;
import com.classic_cars.classics.repository.CustomerRepository;
import com.classic_cars.classics.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers(){
            List<Customer> customers = new ArrayList<>();
            customers.addAll(customerService.findAll());
            if(customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<Customer> getCustomer(){
        for(int i = 0; i < 500; i++){
            try {
                Optional<Customer> oc = customerService.getCustomerRepository().findById(i);
            } catch (Exception e){
                System.out.println("Error with id: " + i);
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
