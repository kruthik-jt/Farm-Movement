package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Movement;

public interface MovementRepository extends JpaRepository<Movement, Long> {
}
