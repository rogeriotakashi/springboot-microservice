package io.rogeriotakashi.catservice.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rogeriotakashi.catservice.models.Breed;
import io.rogeriotakashi.catservice.models.Cat;
import io.rogeriotakashi.catservice.services.CatService;


@RestController
@RequestMapping("api/v1/cat")
public class CatResource {
	
	@Autowired
	CatService catService;
	
	@GetMapping("/random")
	public ResponseEntity<Cat> getCatImages(){
		Cat cat = catService.getRandomCat();	
		return new ResponseEntity<>(cat,HttpStatus.OK);
	}
	
	@GetMapping("/random/{number}")
	public ResponseEntity<List<Cat>> getListOfRandomCatImages(@PathVariable("number")int number){
		List<Cat> listOfCats = catService.getListOfRandomCatImages(number);	
		return new ResponseEntity<>(listOfCats,HttpStatus.OK);
	}
	
	@GetMapping("/breeds")
	public ResponseEntity<Breed[]> getBreeds(){
		Breed[] breeds = catService.getListAllBreeds();	
		return new ResponseEntity<>(breeds,HttpStatus.OK);
	}
	
	
}
