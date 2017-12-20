package com.minipa.scd.scc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * SpringCloudConsumerApplication:
 *
 * @EnableEurekaClient
 *
 * @EnableFeignClients 启用Feign进行远程调用
 * Feign: 申明式WebService客户端,使得编写WebService客户端更加简单,定义一个接口,然后添加注解.
 *        同时也支持JAX-RS标准的注解
 *        支持可插拔式的编码器和解码器
 *        Spring Cloud对Feign进行了封装,使之支持了Spring MVC标准注解和HttpMessageConverts
 *        可与Eureka和Ribbon组合使用以支持负载均衡
 *
 * Hystrix Dashboard开启
 * @EnableHystrixDashboard
 * @EnableCircuitBreaker
 *
 * @author: <a href="mailto:chengjs@servyou.com.cn">chengjs</a>
            <a href="https://github.com/MiniPa">minipa_github</a>
 * @version: 1.0.0, 2017-12-13 shared by all free coders
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}

}
