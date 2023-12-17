package com.classic_cars.classics.controller;

import com.classic_cars.classics.model.Office;
import com.classic_cars.classics.service.OfficeService;
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
@RequestMapping("/office")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    @GetMapping("/all")
    public ResponseEntity<List<Office>> getAllOffices(){
        return new ResponseEntity(officeService.getOfficeRepository().findAll(), HttpStatus.OK);
    }
}
