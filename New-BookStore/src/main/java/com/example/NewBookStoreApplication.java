package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"Controller"})
public class NewBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewBookStoreApplication.class, args);
		
		System.out.println("Project Started");
	}

}
