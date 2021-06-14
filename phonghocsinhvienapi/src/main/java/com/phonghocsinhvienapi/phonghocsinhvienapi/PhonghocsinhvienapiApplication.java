package com.phonghocsinhvienapi.phonghocsinhvienapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.phonghocsinhvienapi.phonghocsinhvienapi.entity")
@EnableJpaRepositories("com.phonghocsinhvienapi.phonghocsinhvienapi.repository")
@ComponentScan("com.phonghocsinhvienapi.phonghocsinhvienapi")
public class PhonghocsinhvienapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonghocsinhvienapiApplication.class, args);
	}

}
