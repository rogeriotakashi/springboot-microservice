package io.rogeriotakashi.generalpetservice.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rogeriotakashi.generalpetservice.models.Album;
import io.rogeriotakashi.generalpetservice.models.Cat;
import io.rogeriotakashi.generalpetservice.services.WebContentService;


@RestController
@RequestMapping("api/v1/webcontent")
public class WebContentResource {
	
	@Autowired
	WebContentService webContentService;
	
	@GetMapping("/home/album/{number}")
	public ResponseEntity<Album> getRandomDogCatAlbum(@PathVariable("number") int number){
		Album album = webContentService.getRandomDogCatAlbum(number);
		
		return new ResponseEntity<>(album,HttpStatus.OK);
	}
	
	
}
