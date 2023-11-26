package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Coordinates;
import com.example.demo.repository.CoordinatesRepository;

import java.util.List;

@Service
public class CoordinatesService {

    @Autowired
    private CoordinatesRepository repository;

    public List<Coordinates> getAll() {
        return repository.findAll();
    }
}

