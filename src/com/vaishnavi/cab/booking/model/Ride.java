package com.vaishnavi.cab.booking.model;

public class Ride {
    private final int rideId;
    private final int userId;
    private final int driverId;
    private final String pickupLocation;
    private final String dropoffLocation;
    private final double fare;
    private final String status;

    public Ride(int rideId, int userId, int driverId, String pickupLocation, String dropoffLocation, double fare, String status) {
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.fare = fare;
        this.status = status;
    }

    public void displayRideDetails() {
        System.out.println("Ride ID: " + rideId + ", User: " + userId + ", Driver: " + driverId +
                ", Pickup: " + pickupLocation + ", Dropoff: " + dropoffLocation + ", Fare: " + fare + ", Status: " + status);
    }

    public int getRideId() {
        return 0;
    }
}

