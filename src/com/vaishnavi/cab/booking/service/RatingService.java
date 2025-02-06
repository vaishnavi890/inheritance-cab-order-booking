package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.repository.RatingRepository;

public class RatingService {
    private final RatingRepository ratingRepository = new RatingRepository();

    public void submitRating(Rating rating) {
        if (rating.getRating() >= 1 && rating.getRating() <= 5) {
            ratingRepository.saveRating(rating);
            System.out.println("Rating submitted successfully.");
        } else {
            System.out.println("Invalid rating. Must be between 1 and 5.");
        }
    }

    public Rating getRatingById(int ratingId) {
        return ratingRepository.getRatingById(ratingId);
    }
}

