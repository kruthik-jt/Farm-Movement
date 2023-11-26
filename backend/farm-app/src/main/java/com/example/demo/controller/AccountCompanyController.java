package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AccountCompany;
import com.example.demo.service.AccountCompanyService;

import java.util.List;

@RestController
@RequestMapping("/api/account-company")
public class AccountCompanyController {

    @Autowired
    private AccountCompanyService service;

    @GetMapping("/all")
    public List<AccountCompany> getAll() {
        return service.getAll();
    }
}

