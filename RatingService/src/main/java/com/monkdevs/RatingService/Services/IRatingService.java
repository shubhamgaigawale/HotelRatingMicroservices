package com.monkdevs.RatingService.Services;

import com.monkdevs.RatingService.Entities.Rating;

import java.util.List;

public interface IRatingService {
    Rating create(Rating rating);

    List<Rating> getRatings();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
