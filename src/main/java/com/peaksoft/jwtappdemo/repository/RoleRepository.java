package com.peaksoft.jwtappdemo.repository;

import com.peaksoft.jwtappdemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
