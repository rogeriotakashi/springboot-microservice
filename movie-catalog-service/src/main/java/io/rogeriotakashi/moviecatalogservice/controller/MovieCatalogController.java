package io.rogeriotakashi.moviecatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.rogeriotakashi.moviecatalogservice.domain.CatalogItem;
import io.rogeriotakashi.moviecatalogservice.domain.Movie;
import io.rogeriotakashi.moviecatalogservice.domain.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder builder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(String userId) {
		UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/" + userId, UserRating.class);
		// For each movie ID, call movie info service and get details
		return ratings.getUserRating().stream()
				.map(rating -> {
					Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(),"Descricao",rating.getRating());
				})
		.collect(Collectors.toList());

	}

}
