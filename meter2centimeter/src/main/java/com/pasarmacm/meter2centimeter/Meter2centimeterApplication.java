package com.pasarmacm.meter2centimeter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Meter2centimeterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Meter2centimeterApplication.class, args);
	}

}
