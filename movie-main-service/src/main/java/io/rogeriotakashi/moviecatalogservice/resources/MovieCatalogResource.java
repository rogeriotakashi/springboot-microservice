package io.rogeriotakashi.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import io.rogeriotakashi.moviecatalogservice.domain.CatalogItem;
import io.rogeriotakashi.moviecatalogservice.domain.UserRating;
import io.rogeriotakashi.moviecatalogservice.services.MovieInfo;
import io.rogeriotakashi.moviecatalogservice.services.UserRatingInfo;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private WebClient.Builder builder;
	
	@Autowired
	private UserRatingInfo userRatingInfo;
	
	@Autowired
	private MovieInfo movieInfo;


	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		UserRating ratings = userRatingInfo.getUserRating(userId);
		// For each movie ID, call movie info service and get details
		return ratings.getUserRating().stream()
				.map(rating -> movieInfo.getCatalogItem(rating))
		.collect(Collectors.toList());

	}


	

	
	
	
	
	
	
	
	
	
	

}
