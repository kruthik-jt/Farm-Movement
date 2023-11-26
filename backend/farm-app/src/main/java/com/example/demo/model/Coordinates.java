package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Coordinates")
public class Coordinates {

    @Id
    @Column(name = "CoordinateID")
    private Long coordinateID;

    @Column(name = "Latitude", nullable = false)
    private Double latitude;

    @Column(name = "Longitude", nullable = false)
    private Double longitude;

    @OneToOne
    @JoinColumn(name = "FarmID")
    private Farm farm;

    // Constructors
    public Coordinates() {
    }

    public Coordinates(Long coordinateID, Double latitude, Double longitude, Farm farm) {
        this.coordinateID = coordinateID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.farm = farm;
    }

    // Getters and setters
    public Long getCoordinateID() {
        return coordinateID;
    }

    public void setCoordinateID(Long coordinateID) {
        this.coordinateID = coordinateID;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
