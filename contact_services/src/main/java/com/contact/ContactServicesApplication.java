package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.contact.repo")
public class ContactServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServicesApplication.class, args);
	}

}
