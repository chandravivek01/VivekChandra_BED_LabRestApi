package com.vcs.collegefest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollegeFestRegistrationPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeFestRegistrationPortalApplication.class, args);
		System.out.println("\nWelcome to the College Fest Registration Portal");
		System.out.println("\nHit localhost:8080/CollegeFestRegistration\n");
	}

}
