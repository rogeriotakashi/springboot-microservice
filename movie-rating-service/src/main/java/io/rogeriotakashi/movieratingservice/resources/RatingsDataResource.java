package io.rogeriotakashi.movieratingservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rogeriotakashi.movieratingservice.models.Rating;
import io.rogeriotakashi.movieratingservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		
		// Hardcoded
		List<Rating> ratings = Arrays.asList(
				new Rating("100", 4),
				new Rating("200", 7)
		);
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}
}