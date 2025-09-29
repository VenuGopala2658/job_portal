package com.jobPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
@ComponentScan(basePackages="com.jobPortal")
@EntityScan(basePackages="com.jobPortal.Entity")
@Configuration
public class JobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}
	
	@Bean
	  public RestTemplate restTemplate() {
		  return new RestTemplate();
	  }

}
