package com.vaishnavi.cab.booking.model;

public class User extends Person{
    public User(int id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    @Override
    public void displayDetails() {
        System.out.println("User ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phone);
    }
}

