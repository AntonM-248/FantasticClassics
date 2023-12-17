package com.classic_cars.classics.service;

import com.classic_cars.classics.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.PrimitiveIterator;

@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    public OfficeRepository getOfficeRepository(){
        return this.officeRepository;
    }
}
