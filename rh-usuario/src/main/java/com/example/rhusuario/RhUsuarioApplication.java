package com.example.rhusuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class RhUsuarioApplication implements CommandLineRunner {

    // Apesar do autowired, o BCrypt não é gerenciado pelo spring,
    // então é necessário criar um Bean
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public void run(String... args) throws Exception {
        //run pertence a interface CommandLineRunner, serve para imprimir
        //valores ou textos quando o spring acabar de levantar o contexto.
        System.out.println("BCRYPT = "+ passwordEncoder.encode("12345"));
    }

    public static void main(String[] args) {
        SpringApplication.run(RhUsuarioApplication.class, args);
    }

}
