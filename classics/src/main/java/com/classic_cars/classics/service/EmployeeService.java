package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeRepository getEmployeeRepository() {
        return this.employeeRepository;
    }
}
