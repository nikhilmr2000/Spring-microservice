package com.cloudgateway.gatewayforrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayforroutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayforroutingApplication.class, args);
	}

}
