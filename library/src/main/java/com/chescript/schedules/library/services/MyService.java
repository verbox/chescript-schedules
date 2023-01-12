package com.chescript.schedules.library.services;

import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServicesProperties.class)
public class MyService {
	private final ServicesProperties servicesProperties;
	
	public MyService(ServicesProperties servicesProperties) {
		this.servicesProperties = servicesProperties;
	}
	
	public String message() {
		return this.servicesProperties.getMessage();
	}
}
