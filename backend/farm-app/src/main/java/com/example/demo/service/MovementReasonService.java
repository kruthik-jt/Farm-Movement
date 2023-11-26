package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MovementReason;
import com.example.demo.repository.MovementReasonRepository;

import java.util.List;

@Service
public class MovementReasonService {

    @Autowired
    private MovementReasonRepository repository;

    public List<MovementReason> getAll() {
        return repository.findAll();
    }
}

