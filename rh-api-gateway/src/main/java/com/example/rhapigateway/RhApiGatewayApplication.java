package com.example.rhapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhApiGatewayApplication.class, args);
    }

}
