package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Farm;

public interface FarmRepository extends JpaRepository<Farm, Long> {
}

