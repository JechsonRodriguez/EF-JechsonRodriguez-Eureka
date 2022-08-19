package com.idat.EFJechsonRodriguezEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfJechsonRodriguezEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJechsonRodriguezEurekaApplication.class, args);
	}

}
