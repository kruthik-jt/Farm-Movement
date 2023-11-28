package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AccountCompany;

public interface AccountCompanyRepository extends JpaRepository<AccountCompany, Long> {
}
