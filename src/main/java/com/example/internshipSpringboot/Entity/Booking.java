package com.example.internshipSpringboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity

    public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Integer id;

        @Column(name = "booking_date")
        private Date bookingDate;


        @Column(name = "status")
        private String status;


     //  @ManyToOne
   //     @JoinColumn(name = "user_id")
    //   private User user;

   //     @ManyToMany
   //     @JoinTable(
       //         name = "booking_flight",
          //      joinColumns = @JoinColumn(name = "booking_id"),
           //     inverseJoinColumns = @JoinColumn(name = "flight_id"))
       // private List<Flight> flights;
    }

