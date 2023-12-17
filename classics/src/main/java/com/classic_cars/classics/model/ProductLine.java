package com.classic_cars.classics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productlines")
@Getter
@Setter
public class ProductLine {
    @Id
    private String productLine;
    private String textDescription;
    private String htmlDescription;
    private byte[] image;
}
