package com.europa.europa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.europa.europa")
public class EuropaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuropaApplication.class, args);
	}

}
