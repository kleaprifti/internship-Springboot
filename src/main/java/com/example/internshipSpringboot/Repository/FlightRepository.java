package com.example.internshipSpringboot.Repository;

import com.example.internshipSpringboot.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
