package com.akbas.springboot.PribasProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.akbas.springboot.PribasProject.Entity.Users;

@SpringBootApplication
public class PribasProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(PribasProjectApplication.class, args);

	}

}