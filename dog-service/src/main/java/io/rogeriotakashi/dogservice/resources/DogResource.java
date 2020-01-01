package io.rogeriotakashi.dogservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rogeriotakashi.dogservice.models.Dog;
import io.rogeriotakashi.dogservice.models.DogList;
import io.rogeriotakashi.dogservice.services.DogService;

@RestController
@RequestMapping("api/v1/dog")
public class DogResource {

	@Autowired
	DogService dogService;
	
	@GetMapping("random")
	public ResponseEntity<Dog> getRandomDog() {
		Dog dog = dogService.getRandomDog();
		return new ResponseEntity<>(dog, HttpStatus.OK);
		
	}
	
	@GetMapping("random/{number}")
	public ResponseEntity<DogList> getListOfRandomDogs(@PathVariable("number") int number) {
		DogList dogList = dogService.getListOfRandomDogs(number);
		return new ResponseEntity<>(dogList, HttpStatus.OK);
		
	}
}
