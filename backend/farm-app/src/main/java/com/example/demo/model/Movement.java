package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movement")
public class Movement {

    @Id
    @Column(name = "MovementID")
    private Long movementID;

    @Column(name = "NumItemsMoved", nullable = false)
    private Integer numItemsMoved;

    @Column(name = "ShipmentsStartDate", nullable = false)
    private Date shipmentsStartDate;

    @ManyToOne
    @JoinColumn(name = "MovementReasonID")
    private MovementReason movementReason;

    @OneToOne
    @JoinColumn(name = "OriginID")
    private Farm origin;

    @OneToOne
    @JoinColumn(name = "DestinationID")
    private Farm destination;

    // Constructors
    public Movement() {
    }

    public Movement(Long movementID, Integer numItemsMoved, Date shipmentsStartDate,
                    MovementReason movementReason, Farm origin, Farm destination) {
        this.movementID = movementID;
        this.numItemsMoved = numItemsMoved;
        this.shipmentsStartDate = shipmentsStartDate;
        this.movementReason = movementReason;
        this.origin = origin;
        this.destination = destination;
    }

    // Getters and setters
    public Long getMovementID() {
        return movementID;
    }

    public void setMovementID(Long movementID) {
        this.movementID = movementID;
    }

    public Integer getNumItemsMoved() {
        return numItemsMoved;
    }

    public void setNumItemsMoved(Integer numItemsMoved) {
        this.numItemsMoved = numItemsMoved;
    }

    public Date getShipmentsStartDate() {
        return shipmentsStartDate;
    }

    public void setShipmentsStartDate(Date shipmentsStartDate) {
        this.shipmentsStartDate = shipmentsStartDate;
    }

    public MovementReason getMovementReason() {
        return movementReason;
    }

    public void setMovementReason(MovementReason movementReason) {
        this.movementReason = movementReason;
    }

    public Farm getOrigin() {
        return origin;
    }

    public void setOrigin(Farm origin) {
        this.origin = origin;
    }

    public Farm getDestination() {
        return destination;
    }

    public void setDestination(Farm destination) {
        this.destination = destination;
    }
}
