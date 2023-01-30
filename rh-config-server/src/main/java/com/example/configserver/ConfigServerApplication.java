package com.example.configserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication implements CommandLineRunner {

//    @Value("${spring.cloud.config.server.git.username}")
//    private String userGit;
//    @Value("${spring.cloud.config.server.git.password}")
//    private String userPass;

    //Serve para passar alguma instrução durante a execução do Spring
    @Override
    public void run(String... args) throws Exception {
//        System.out.println("USERNAME == "+userGit); verifica se as váriveis esão sendo testadas.
//        System.out.println("PASSWORD == "+userPass);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
