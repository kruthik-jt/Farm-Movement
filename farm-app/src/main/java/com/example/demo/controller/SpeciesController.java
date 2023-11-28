package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Species;
import com.example.demo.service.SpeciesService;

import java.util.List;

@RestController
@RequestMapping("/api/species")
public class SpeciesController {

    @Autowired
    private SpeciesService service;

    @GetMapping("/all")
    public List<Species> getAll() {
        return service.getAll();
    }
}

