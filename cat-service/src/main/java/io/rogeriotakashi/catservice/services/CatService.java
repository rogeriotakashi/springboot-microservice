package io.rogeriotakashi.catservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.rogeriotakashi.catservice.models.Breed;
import io.rogeriotakashi.catservice.models.Cat;


@Service
public class CatService {
	
	@Value("${api.url}")
	private String API_URL;
	
	@Value("${api.key}")
	private String API_KEY;

	@Autowired
	private RestTemplate rest;
	
	/**
	 * Get an random cat image
	 * @return Cat cat
	 */
	public Cat getRandomCat() {
		Cat[] cat = rest.getForObject(API_URL + "/v1/images/search", Cat[].class);
		return cat[0];
	}
	
	public Breed[] getListAllBreeds() {
		Breed[] breeds = rest.getForObject(API_URL + "/v1/breeds", Breed[].class);
		return breeds;
	}

	public List<Cat> getListOfRandomCatImages(int number) {
		List<Cat> listOfCats = new ArrayList<>();
		for(int i = 0; i < number; i++) {
			listOfCats.add(this.getRandomCat());
		}
		return listOfCats;
	}
	
	
}
