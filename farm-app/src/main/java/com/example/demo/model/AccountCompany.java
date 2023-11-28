package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AccountCompany")
public class AccountCompany {

    @Id
    @Column(name = "AccountID")
    private Long accountID;

    @Column(name = "CompanyName", nullable = false)
    private String companyName;

    // Constructors
    public AccountCompany() {
    }

    public AccountCompany(Long accountID, String companyName) {
        this.accountID = accountID;
        this.companyName = companyName;
    }

    // Getters and setters
    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
