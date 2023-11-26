package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovementReason;
import com.example.demo.service.MovementReasonService;

import java.util.List;

@RestController
@RequestMapping("/api/movement-reason")
public class MovementReasonController {

    @Autowired
    private MovementReasonService service;

    @GetMapping("/all")
    public List<MovementReason> getAll() {
        return service.getAll();
    }
}

