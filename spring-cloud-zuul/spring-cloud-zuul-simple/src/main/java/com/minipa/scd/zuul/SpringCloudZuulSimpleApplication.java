package com.minipa.scd.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulSimpleApplication.class, args);
	}
}
