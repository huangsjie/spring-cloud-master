package com.cloud.master;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@FeignClient
@MapperScan("com.cloud.master.mapper")
public class ProducerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerSystemApplication.class, args);
	}

}
