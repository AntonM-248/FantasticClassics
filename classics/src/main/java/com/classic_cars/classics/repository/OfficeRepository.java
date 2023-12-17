package com.classic_cars.classics.repository;

import com.classic_cars.classics.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {
}
