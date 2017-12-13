package com.minipa.scd.scc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * SpringCloudConsumerApplication:
 *
 * @EnableEurekaClient
 *
 * @author: <a href="mailto:chengjs@servyou.com.cn">chengjs</a>
            <a href="https://github.com/MiniPa">minipa_github</a>
 * @version: 1.0.0, 2017-12-13 shared by all free coders
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}
}
