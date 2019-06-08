package com.linkia.jessica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JessicaMicroSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(JessicaMicroSearchApplication.class, args);
	}

}
