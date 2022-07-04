package com.example.internshipSpringboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity

    @Table(name = "user_details")
    public class userDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Integer id;

        @Column(name = "first_name", nullable = false)
        private String firstName;

        @Column(name = "last_name", nullable = false)
        private String lastName;

        @Column(name = "email")
        private String email;

        @Column(name = "phone_number")
        private String phoneNumber;

    //    @OneToOne(mappedBy = "user_details")
      //  private User user;
    }

