package com.cursospringcloud.rheurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RhEurekaserverApplication {
    // TODO PODE VISUALIZAR O EUREKA SERVER ACESSANDO A PORTA DELE QUE É http://localhost:8761
    public static void main(String[] args) {
        SpringApplication.run(RhEurekaserverApplication.class, args);
    }

}
