package com.example.PrvaTacka.repository;

import com.example.PrvaTacka.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    
}