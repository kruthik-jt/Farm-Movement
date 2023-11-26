package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Farm;
import com.example.demo.repository.FarmRepository;

import java.util.List;

@Service
public class FarmService {

    @Autowired
    private FarmRepository repository;

    public List<Farm> getAll() {
        return repository.findAll();
    }
}
