package com.example.internshipSpringboot.Repository;

import com.example.internshipSpringboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {
}
