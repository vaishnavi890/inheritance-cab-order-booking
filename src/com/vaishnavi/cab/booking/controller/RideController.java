package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.service.RideService;

public class RideController {
    private final RideService rideService = new RideService();

    public void bookRide(int rideId, int userId, int driverId, String pickupLocation, String dropoffLocation, double fare, String status) {
        Ride newRide = new Ride(rideId, userId, driverId, pickupLocation, dropoffLocation, fare, status);
        rideService.bookRide(newRide);
    }

    public void getRideDetails(int rideId) {
        Ride ride = rideService.getRideById(rideId);
        if (ride != null) {
            ride.displayRideDetails();
        } else {
            System.out.println("Ride not found.");
        }
    }
}
