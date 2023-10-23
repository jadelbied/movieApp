package com.movieproject.moviesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MoviesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesappApplication.class, args);
	}

}
