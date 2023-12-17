package com.classic_cars.classics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    int orderNumber;
    Date orderDate;
    Date requiredDate;
    Date shippedDate;
    String status;
    String comments;
    int customerNumber;
}
