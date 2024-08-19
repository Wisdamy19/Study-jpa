package com.studyjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.studyjpa")
public class StudyjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyjpaApplication.class, args);
	}

}
