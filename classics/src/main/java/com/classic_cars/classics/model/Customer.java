package com.classic_cars.classics.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "customerNumber")
    Integer customerNumber;
    @Column(name = "customerName")
    String customerName;
    @Column(name = "contactLastName")
    String contactLastNam;
    @Column(name = "contactFirstName")
    String contactFirstName;
    @Column(name = "phone")
    String phone;
    @Column(name = "addressLine1")
    String addressLine1;
    @Column(name = "addressLine2")
    String addressLine2;
    @Column(name = "city")
    String city;
    @Column(name = "state")
    String state;
    @Column(name = "postalCode")
    String postalCode;
    @Column(name = "country")
    String country;
    @Column(name = "salesRepEmployeeNumber", nullable = true)
    Integer salesRepEmployeeNumber;
    @Column(name = "creditLimit")
    Double creditLimit;
}
