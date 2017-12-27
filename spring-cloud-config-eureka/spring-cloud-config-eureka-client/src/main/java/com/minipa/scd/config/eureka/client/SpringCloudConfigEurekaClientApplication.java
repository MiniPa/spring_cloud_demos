package com.minipa.scd.config.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigEurekaClientApplication.class, args);
	}
}
