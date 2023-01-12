package com.chescript.schedules.library;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.chescript.schedules.library.services.MyService;

@SpringBootTest
class MyServiceTest {
	
	@Autowired
	private MyService myService;

	@Test
	void contextLoads() {
		assertThat(myService.message()).isNotNull();
	}
	
	@SpringBootApplication
	static class TestConfiguration {
		
	}

}
