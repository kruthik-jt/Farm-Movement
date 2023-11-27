package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public List<Address> getAll() {
        return repository.findAll();
    }
    
    public List<String> getAllFarmStates() {
    	return repository.getAllFarmStates();
    }
}

