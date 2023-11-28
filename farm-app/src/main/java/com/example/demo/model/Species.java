package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Species")
public class Species {

    @Id
    @Column(name = "SpeciesID")
    private Long speciesID;

    @Column(name = "SpeciesName", nullable = false)
    private String speciesName;

    // Constructors
    public Species() {
    }

    public Species(Long speciesID, String speciesName) {
        this.speciesID = speciesID;
        this.speciesName = speciesName;
    }

    // Getters and setters
    public Long getSpeciesID() {
        return speciesID;
    }

    public void setSpeciesID(Long speciesID) {
        this.speciesID = speciesID;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
