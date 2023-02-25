package com.spring02.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.spring02.demo")
public class DemoApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8180 ); 
		SpringApplication.run(DemoApplication.class, args);
	}

}
