package com.classic_cars.classics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "payments")
@Getter
@Setter
public class Payment {
    @Id
    int customerNumber;
    String checkNumber;
    Date paymentDate;
    double amount;
}
