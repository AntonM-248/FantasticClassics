package com.classic_cars.classics.controller;

import com.classic_cars.classics.model.ProductLine;
import com.classic_cars.classics.service.ProductLineService;
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
@RequestMapping("/productline")
public class ProductLineController {
    @Autowired
    private ProductLineService productLineService;

    @GetMapping("/all")
    public ResponseEntity<List<ProductLine>> getAllProductLines(){
        return new ResponseEntity<>(productLineService.getProductLineRepository().findAll(), HttpStatus.OK);
    }
}
