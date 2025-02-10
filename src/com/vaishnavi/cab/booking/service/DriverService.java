package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.repository.DriverRepository;


public class DriverService extends BaseService{
    @Override
    public void add() {
        System.out.println("Driver added.");
    }

    @Override
    public void update() {
        System.out.println("Driver updated.");
    }

    @Override
    public void delete() {
        System.out.println("Driver deleted.");
    }

    @Override
    public void view() {
        System.out.println("Driver details viewed.");
    }

    public void registerDriver(Driver newDriver) {
    }

    public Driver getDriverById(int driverId) {
        return null;
    }
}

