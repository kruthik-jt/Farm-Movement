package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Farm")
public class Farm {

    @Id
    @Column(name = "FarmID")
    private Long farmID;

    @Column(name = "FarmName", nullable = false)
    private String farmName;

    @Column(name = "PremiseID", nullable = false)
    private String premiseID;
    
    @Column(name = "TotalAnimal", nullable = false)
    private int totalAnimal;

    @OneToOne
    @JoinColumn(name = "AddressID")
    private Address address;

    // Constructors
    public Farm() {
    }

    public Farm(Long farmID, String farmName, String premiseID, int totalAnimal, Address address) {
        this.farmID = farmID;
        this.farmName = farmName;
        this.premiseID = premiseID;
        this.totalAnimal = totalAnimal;
        this.address = address;
    }

    // Getters and setters
    public Long getFarmID() {
        return farmID;
    }

    public void setFarmID(Long farmID) {
        this.farmID = farmID;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getPremiseID() {
        return premiseID;
    }

    public void setPremiseID(String premiseID) {
        this.premiseID = premiseID;
    }
    
    public int getTotalAnimal() {
        return totalAnimal;
    }

    public void setFarmID(int totalAnimal) {
        this.totalAnimal = totalAnimal;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
