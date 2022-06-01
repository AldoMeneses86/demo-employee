package com.ameneses.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SwaggerSpringDemoApplication {

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
	public String healthCheck() {
		return "200 OK";
	}
    public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringDemoApplication.class, args);
	}
}
