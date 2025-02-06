package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.HashMap;
import java.util.Map;


public class RatingRepository {
    private Map<Integer, Rating> ratings = new HashMap<>();

    public void saveRating(Rating rating) {
        ratings.put(rating.getRatingId(), rating);
        System.out.println("Rating saved successfully.");
    }

    public Rating getRatingById(int ratingId) {
        return ratings.get(ratingId);
    }
}
