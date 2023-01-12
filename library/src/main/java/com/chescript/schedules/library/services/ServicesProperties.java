package com.chescript.schedules.library.services;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class ServicesProperties {
	public String getMessage() {
		return "HELOŁ";
	}
}
