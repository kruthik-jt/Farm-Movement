package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Farm;
import com.example.demo.service.FarmService;

import java.util.List;

@RestController
@RequestMapping("/api/farm")
public class FarmController {

    @Autowired
    private FarmService service;

    @GetMapping("/all")
    public List<Farm> getAll() {
        return service.getAll();
    }
}

