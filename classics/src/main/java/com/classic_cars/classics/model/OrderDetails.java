package com.classic_cars.classics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orderdetails")
@Getter
@Setter
@IdClass(OrderDetailsId.class)
public class OrderDetails {
    @Id
    int orderNumber;
    @Id
    String productCode;
    int quantityOrdered;
    double priceEach;
    int orderLineNumber;
}

