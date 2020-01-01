package io.rogeriotakashi.dogservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.rogeriotakashi.dogservice.models.Dog;
import io.rogeriotakashi.dogservice.models.DogList;

@Service
public class DogService {
	
	@Value("${api.url}")
	private String API_URL;
	
	@Autowired
	RestTemplate rest;
	
	/**
	 * Get an random Dog image from API
	 * @return Dog
	 */
	public Dog getRandomDog() {
		return rest.getForObject(API_URL + "/api/breeds/image/random", Dog.class);
	}

	public DogList getListOfRandomDogs(int number) {
		return rest.getForObject(API_URL + "/api/breeds/image/random/"+number, DogList.class);
	}
}
