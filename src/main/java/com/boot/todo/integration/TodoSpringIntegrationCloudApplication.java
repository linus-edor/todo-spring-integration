package com.boot.todo.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoSpringIntegrationCloudApplication {
	Logger log = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(TodoSpringIntegrationCloudApplication.class, args);
	}
	
	@Bean
	CommandLineRunner appStarted(ApplicationContext context) {
		return values -> {
			log.info("Todo app is started.");
		};
	}

}
