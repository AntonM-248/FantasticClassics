package com.classic_cars.classics.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    int employeeNumber;
    String lastName;
    String firstName;
    String extension;
    String email;
    String officeCode;
    @Nullable
    int reportsTo;
    String jobTitle;
}
