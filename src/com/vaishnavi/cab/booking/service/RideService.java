package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    private final List<Ride> rides = new ArrayList<>();

    public void bookRide(Ride ride) {
        rides.add(ride);
        System.out.println("Ride booked successfully.");
    }

    public Ride getRideById(int rideId) {
        for (Ride r : rides) {
            if (r.getRideId() == rideId) {
                return r;
            }
        }
        return null;
    }
}
