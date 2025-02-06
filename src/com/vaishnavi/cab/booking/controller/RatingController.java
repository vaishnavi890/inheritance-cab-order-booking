package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.service.RatingService;

public class RatingController {
    private final RatingService ratingService = new RatingService();

    public void submitRating(int ratingId, int rideId, int userId, int driverId, int rating, String review) {
        Rating newRating = new Rating(ratingId, rideId, userId, driverId, rating, review);
        ratingService.submitRating(newRating);
    }

    public void getRatingDetails(int ratingId) {
        Rating rating = ratingService.getRatingById(ratingId);
        if (rating != null) {
            rating.displayRating();
        } else {
            System.out.println("Rating not found.");
        }
    }
}

