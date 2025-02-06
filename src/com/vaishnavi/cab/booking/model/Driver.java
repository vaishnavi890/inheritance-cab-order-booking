package com.vaishnavi.cab.booking.model;

public class Driver extends Person{
    private final String cabDetails;

    public Driver(int id, String name, String email, String phone, String cabDetails) {
        super(id, name, email, phone);
        this.cabDetails = cabDetails;
    }

    @Override
    public void displayDetails() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Cab Details: " + cabDetails);
    }

    public String getCabDetails() { return cabDetails; }
}
