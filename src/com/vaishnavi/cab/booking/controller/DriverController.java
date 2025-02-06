package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.service.DriverService;

public class DriverController {
    private final DriverService driverService = new DriverService();

    public void registerDriver(int driverId, String name, String email, String phone, String cabDetails) {
        Driver newDriver = new Driver(driverId, name, email, phone, cabDetails);
        driverService.registerDriver(newDriver);
    }

    public void getDriverDetails(int driverId) {
        Driver driver = driverService.getDriverById(driverId);
        if (driver != null) {
            driver.displayDetails();
        } else {
            System.out.println("Driver not found.");
        }
    }
}

