package com.drink_api.drinkapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.drink_api.drinkapi"})
public class DrinkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkApiApplication.class, args);
	}

}
