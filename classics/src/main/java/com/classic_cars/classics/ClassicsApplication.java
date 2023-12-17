package com.classic_cars.classics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJpaRepositories("com.classic_cars.classics.repository")
public class ClassicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassicsApplication.class, args);
	}

}
