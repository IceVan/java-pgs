package com.ice.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeApplication.class, args);
	}

	@Bean
	String getMyString() { return "myString"; }

	@Bean
	String getMySecondString() { return "mySecondString"; }
}
