package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movement;
import com.example.demo.repository.MovementRepository;

import java.util.List;

@Service
public class MovementService {

    @Autowired
    private MovementRepository repository;

    public List<Movement> getAll() {
        return repository.findAll();
    }
}

