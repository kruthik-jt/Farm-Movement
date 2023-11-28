package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.MovementReason;

public interface MovementReasonRepository extends JpaRepository<MovementReason, Long> {
}
