package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coordinates;
import com.example.demo.service.CoordinatesService;

import java.util.List;

@RestController
@RequestMapping("/api/coordinates")
public class CoordinatesController {

    @Autowired
    private CoordinatesService service;

    @GetMapping("/all")
    public List<Coordinates> getAll() {
        return service.getAll();
    }
}

