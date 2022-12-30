package com.orell.lms.alumni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient

public class AlumniServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumniServiceApplication.class, args);
	}

}
