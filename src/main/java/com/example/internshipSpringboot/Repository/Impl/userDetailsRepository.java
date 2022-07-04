package com.example.internshipSpringboot.Repository.Impl;

import com.example.internshipSpringboot.Entity.userDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDetailsRepository extends JpaRepository<userDetails,Integer> {
}
