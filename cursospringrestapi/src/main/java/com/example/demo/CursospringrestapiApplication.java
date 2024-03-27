package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EntityScan(basePackages = {"curso.api.rest.model"})
@ComponentScan(basePackages= {"cursos.*"})
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})
public class CursospringrestapiApplication {

	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursospringrestapiApplication.class, args);
	}

}
