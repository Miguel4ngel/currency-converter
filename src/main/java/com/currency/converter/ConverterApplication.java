package com.currency.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.currency.converter.data.entity" })
@EnableJpaRepositories("com.currency.converter.data.repository")
@ComponentScan(basePackages = { "com.currency.converter.presentation.controller", "com.currency.converter.domain.service",
		"com.currency.converter.presentation.advisor" })
public class ConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterApplication.class, args);
	}

}
