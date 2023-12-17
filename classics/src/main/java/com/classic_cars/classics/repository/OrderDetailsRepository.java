package com.classic_cars.classics.repository;

import com.classic_cars.classics.model.OrderDetails;
import com.classic_cars.classics.model.OrderDetailsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsId> {
}
