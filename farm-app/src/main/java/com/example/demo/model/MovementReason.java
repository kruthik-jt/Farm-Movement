package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MovementReason")
public class MovementReason {

    @Id
    @Column(name = "MovementReasonID")
    private Long movementReasonID;

    @Column(name = "ReasonDescription", nullable = false)
    private String reasonDescription;

    // Constructors
    public MovementReason() {
    }

    public MovementReason(Long movementReasonID, String reasonDescription) {
        this.movementReasonID = movementReasonID;
        this.reasonDescription = reasonDescription;
    }

    // Getters and setters
    public Long getMovementReasonID() {
        return movementReasonID;
    }

    public void setMovementReasonID(Long movementReasonID) {
        this.movementReasonID = movementReasonID;
    }

    public String getReasonDescription() {
        return reasonDescription;
    }

    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }
}
