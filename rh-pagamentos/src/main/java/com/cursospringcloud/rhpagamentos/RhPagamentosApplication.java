package com.cursospringcloud.rhpagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "rh-trabalhador")
@SpringBootApplication
@EnableFeignClients
public class RhPagamentosApplication {
	public static void main(String[] args) {
		SpringApplication.run(RhPagamentosApplication.class, args);
	}
}
