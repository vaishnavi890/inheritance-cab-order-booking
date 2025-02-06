package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.repository.DriverRepository;


public class DriverService {
    private final DriverRepository driverRepository = new DriverRepository();

    public void registerDriver(Driver driver) {
        if (driverRepository.getDriverById(driver.getId()) == null) {
            driverRepository.saveDriver(driver);
            System.out.println("Driver " + driver.getName() + " registered successfully.");
        } else {
            System.out.println("Driver with ID " + driver.getId() + " already exists.");
        }
    }

    public Driver getDriverById(int driverId) {
        return driverRepository.getDriverById(driverId);
    }
}

