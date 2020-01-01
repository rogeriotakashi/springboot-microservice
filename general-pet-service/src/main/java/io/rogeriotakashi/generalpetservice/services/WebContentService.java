package io.rogeriotakashi.generalpetservice.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.rogeriotakashi.generalpetservice.models.Album;
import io.rogeriotakashi.generalpetservice.models.Cat;
import io.rogeriotakashi.generalpetservice.models.DogList;


@Service
public class WebContentService {

	@Autowired
	private RestTemplate rest;
	
	public Album getRandomDogCatAlbum(int number) {
		Album album =  new Album();
		DogList dogs = rest.getForObject("http://dog-service/api/v1/dog/random/"+number, DogList.class);
		Cat[] cats = rest.getForObject("http://cat-service/api/v1/cat/random/"+number, Cat[].class);

		List<String> catUrls = Arrays.asList(cats).stream().map(Cat::getUrl).collect(Collectors.toList());
		Stream<String> urls = Stream.concat(catUrls.stream(), dogs.getMessage().stream());
		album.setUrls(urls.collect(Collectors.toList()));
		
		return album;
	}
}
