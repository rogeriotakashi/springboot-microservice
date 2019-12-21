package io.rogeriotakashi.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.rogeriotakashi.moviecatalogservice.domain.CatalogItem;
import io.rogeriotakashi.moviecatalogservice.domain.Movie;
import io.rogeriotakashi.moviecatalogservice.domain.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder builder;

	@RequestMapping("/{userId}")
	@HystrixCommand(fallbackMethod = "getFallbackCatalog")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		UserRating ratings = restTemplate.getForObject("http://movie-rating-service/ratingsdata/users/" + userId, UserRating.class);
		// For each movie ID, call movie info service and get details
		return ratings.getUserRating().stream()
				.map(rating -> {
					Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(),movie.getOverview(),rating.getRating());
				})
		.collect(Collectors.toList());

	}
	
	public List<CatalogItem> getFallbackCatalog(@PathVariable("userId")  String userId) {
		return Arrays.asList(new CatalogItem("No movie","",0));

	}
	
	

}
