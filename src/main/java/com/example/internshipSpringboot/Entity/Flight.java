package com.example.internshipSpringboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Flight {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Integer id;

        @Column(name = "origin", nullable = false)
        private String origin;

        @Column(name = "destination", nullable = false)
        private String destination;

        @Column(name = "airline")
        private String airline;

        @Column(name = "flight_number")
        private String flightNumber;

        @Column(name = "departure_date")
        private Date departureDAte;

        @Column(name = "arrival_date")
        private Date arrivalDAte;

        @Column(name = "status")
        private String status;

 //       @ManyToMany(cascade = CascadeType.ALL, mappedBy = "flights")
  //      private List<Booking> bookings;


    }
