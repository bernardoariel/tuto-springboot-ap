package com.bolsadeideas.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bolsadeideas.springboot.app"})
public class ApiRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiRest1Application.class, args);
	}

}
