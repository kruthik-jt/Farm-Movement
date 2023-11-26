package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Species;
import com.example.demo.repository.SpeciesRepository;

import java.util.List;

@Service
public class SpeciesService {

    @Autowired
    private SpeciesRepository repository;

    public List<Species> getAll() {
        return repository.findAll();
    }
}

