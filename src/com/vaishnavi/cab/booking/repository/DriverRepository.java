package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.HashMap;
import java.util.Map;


public class DriverRepository {
    private final Map<Integer, Driver> drivers = new HashMap<>();

    public void saveDriver(Driver driver) {
        drivers.put(driver.getId(), driver);
        System.out.println("Driver saved successfully.");
    }

    public Driver getDriverById(int driverId) {
        return drivers.get(driverId);
    }
}

