package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @Column(name = "AddressID")
    private Long addressID;

    @Column(name = "Street", nullable = false)
    private String street;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "State", nullable = false)
    private String state;

    @Column(name = "PostalCode", nullable = false)
    private String postalCode;

    // Constructors
    public Address() {
    }

    public Address(Long addressID, String street, String city, String state, String postalCode) {
        this.addressID = addressID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    // Getters and setters
    public Long getAddressID() {
        return addressID;
    }

    public void setAddressID(Long addressID) {
        this.addressID = addressID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
