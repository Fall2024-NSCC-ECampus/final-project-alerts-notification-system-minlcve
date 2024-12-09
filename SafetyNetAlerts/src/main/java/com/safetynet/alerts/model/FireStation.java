package com.safetyalerts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FireStation {

    @Id
    private int stationNumber;
    private String address;

    // Getters and Setters
    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
