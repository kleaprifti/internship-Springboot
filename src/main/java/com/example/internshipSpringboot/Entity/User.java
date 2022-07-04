package com.example.internshipSpringboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Integer id;

        @Column(name = "username", nullable = false)
        private String username;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "role")
        private String role;

      //  @OneToOne(cascade = CascadeType.ALL)
     //   @JoinColumn(name = "user_id", referencedColumnName = "id")
     //   private userDetails user_details;

     //   @OneToMany(mappedBy = "user")
     //   Set<Booking> bookings;

    }

