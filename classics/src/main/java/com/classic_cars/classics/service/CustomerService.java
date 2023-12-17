package com.classic_cars.classics.service;

import com.classic_cars.classics.model.Customer;
import com.classic_cars.classics.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerRepository getCustomerRepository(){
        return this.customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
