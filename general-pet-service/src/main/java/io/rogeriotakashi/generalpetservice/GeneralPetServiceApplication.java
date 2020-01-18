package io.rogeriotakashi.generalpetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GeneralPetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralPetServiceApplication.class, args);
	}

}
