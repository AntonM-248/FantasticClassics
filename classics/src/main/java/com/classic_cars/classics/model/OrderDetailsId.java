package com.classic_cars.classics.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
public class OrderDetailsId implements Serializable {
    private int orderNumber;
    private String productCode;

    public OrderDetailsId(int orderNumber, String productCode) {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
    }
}
