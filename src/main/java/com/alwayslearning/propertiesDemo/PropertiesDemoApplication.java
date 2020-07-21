package com.alwayslearning.propertiesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class PropertiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesDemoApplication.class, args);
	}

}
