package com.cloud.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * # eureka 集群
 *
 * java -jar cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
 * java -jar cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaClusterApplication.class, args);
	}
}
