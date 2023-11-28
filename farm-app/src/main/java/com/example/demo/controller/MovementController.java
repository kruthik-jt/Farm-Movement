package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movement;
import com.example.demo.service.MovementService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/movement")
public class MovementController {

    @Autowired
    private MovementService service;

    @GetMapping("/all")
    public List<Movement> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/movement-reason")
    public List<Object> getMovementReason() {
    	return service.getMovementReason();
    }
    
    @GetMapping("/movement-state")
    public Map<String, List<String>> getInAndOutState() {
    	return service.getInAndOutState();
    }
    
    @GetMapping("/coordinates")
    public List<String> getMovementCoordinates() {
    	return service.getMovementCoordinates();
    }
}

