package com.peaksoft.jwtappdemo.repository;

import com.peaksoft.jwtappdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
