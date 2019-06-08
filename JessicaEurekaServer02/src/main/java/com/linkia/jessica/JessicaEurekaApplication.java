package com.linkia.jessica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JessicaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JessicaEurekaApplication.class, args);
	}

}
