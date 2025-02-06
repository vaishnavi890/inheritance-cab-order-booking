package com.vaishnavi.cab.booking.model;

public abstract class Person {
    protected int id;
    protected String name;
    protected String email;
    protected String phone;

    public Person(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public abstract void displayDetails();

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}

