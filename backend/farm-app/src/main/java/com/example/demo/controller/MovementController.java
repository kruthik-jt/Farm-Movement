package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movement;
import com.example.demo.service.MovementService;

import java.util.List;

@RestController
@RequestMapping("/api/movement")
public class MovementController {

    @Autowired
    private MovementService service;

    @GetMapping("/all")
    public List<Movement> getAll() {
        return service.getAll();
    }
}

