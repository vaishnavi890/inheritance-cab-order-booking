package com.vaishnavi.cab.booking.model;

public class Rating {
    private final int ratingId;
    private final int rideId;
    private final int userId;
    private final int driverId;
    private final int rating;
    private final String review;

    public Rating(int ratingId, int rideId, int userId, int driverId, int rating, String review) {
        this.ratingId = ratingId;
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.rating = rating;
        this.review = review;
    }

    public void displayRating() {
        System.out.println("Rating ID: " + ratingId + ", Ride: " + rideId + ", User: " + userId +
                ", Driver: " + driverId + ", Rating: " + rating + ", Review: " + review);
    }

    public int getRating() {
        return 0;
    }

    public Integer getRatingId() {
        return 0;
    }
}

