package io.rogeriotakashi.springzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringZuulApplication {

	/*Para acessar os endpoints, utilizar http://localhost:8762/actuator/routes/details*/
	
	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApplication.class, args);
	}

}
