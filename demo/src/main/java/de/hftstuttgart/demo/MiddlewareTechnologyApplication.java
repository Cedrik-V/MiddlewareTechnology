package de.hftstuttgart.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MiddlewareTechnologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareTechnologyApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Hello World";
	}

}
