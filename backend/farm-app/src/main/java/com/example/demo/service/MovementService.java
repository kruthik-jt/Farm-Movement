package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movement;
import com.example.demo.repository.MovementRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovementService {

    @Autowired
    private MovementRepository repository;

    public List<Movement> getAll() {
        return repository.findAll();
    }
    
    public List<Object> getMovementReason() {
    	return repository.getMovementReason();
    }
    
    public Map<String, List<String>> getInAndOutState() {
    	Map<String, List<String>> movementStatesDict = new HashMap<>();
    	movementStatesDict.put("IN", repository.getMoveInState());
    	movementStatesDict.put("OUT", repository.getMoveOutState());
    	return movementStatesDict;
    }
    
    public List<String> getMovementCoordinates() {
    	return repository.getMovementCoordinates();
    }
}

