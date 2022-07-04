package com.example.internshipSpringboot.Repository;

import com.example.internshipSpringboot.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,Integer> {
}
