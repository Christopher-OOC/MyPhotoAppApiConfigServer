package com.javalord.microservices.MyPhotoAppApiConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyPhotoAppApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPhotoAppApiConfigServerApplication.class, args);
	}

}
