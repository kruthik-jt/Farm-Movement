package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @GetMapping("/all")
    public List<Address> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/states")
    public List<String> getAllFarmStates() {
    	return service.getAllFarmStates();
    }
}

