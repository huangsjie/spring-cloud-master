package com.cloud.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CloudConsumnerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumnerZuulApplication.class, args);
	}
}
