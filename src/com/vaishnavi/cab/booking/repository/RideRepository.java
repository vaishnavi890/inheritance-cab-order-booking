package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.HashMap;
import java.util.Map;


public class RideRepository {
    private final Map<Integer, Ride> rides = new HashMap<>();

    public void saveRide(Ride ride) {
        rides.put(ride.getRideId(), ride);
        System.out.println("Ride saved successfully.");
    }

    public Ride getRideById(int rideId) {
        return rides.get(rideId);
    }
}

