package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccountCompany;
import com.example.demo.repository.AccountCompanyRepository;

import java.util.List;

@Service
public class AccountCompanyService {

    @Autowired
    private AccountCompanyRepository repository;

    public List<AccountCompany> getAll() {
        return repository.findAll();
    }
}

