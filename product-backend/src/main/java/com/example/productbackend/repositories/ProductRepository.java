package com.example.productbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productbackend.entities.product;

public interface ProductRepository extends JpaRepository<product,Long> {
    
}
