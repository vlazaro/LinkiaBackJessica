package com.linkia.jessica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class JessicaMicroLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JessicaMicroLoginApplication.class, args);
	}

}
