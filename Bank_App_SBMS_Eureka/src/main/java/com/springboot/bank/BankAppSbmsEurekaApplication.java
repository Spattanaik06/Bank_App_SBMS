package com.springboot.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankAppSbmsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppSbmsEurekaApplication.class, args);
	}

}
