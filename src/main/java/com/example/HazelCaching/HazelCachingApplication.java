package com.example.HazelCaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class HazelCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelCachingApplication.class, args);
	}

}
