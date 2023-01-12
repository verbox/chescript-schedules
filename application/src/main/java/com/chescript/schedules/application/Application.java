package com.chescript.schedules.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chescript.schedules.library.services.MyService;

@SpringBootApplication(scanBasePackages = "com.chescript.schedules")
@RestController
public class Application {
	
	private final MyService myService;
	
	public Application(MyService service) {
		this.myService = service;
	}
	
	@GetMapping("/")
  	public String home() {
	  return myService.message();
  	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
