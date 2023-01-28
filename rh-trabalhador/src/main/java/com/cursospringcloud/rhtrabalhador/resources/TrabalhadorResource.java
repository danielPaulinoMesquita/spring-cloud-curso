package com.cursospringcloud.rhtrabalhador.resources;

import com.cursospringcloud.rhtrabalhador.entities.Trabalhador;
import com.cursospringcloud.rhtrabalhador.repositories.TrabalhadorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

    private static Logger logger = LoggerFactory.getLogger(TrabalhadorResource.class);

    @Value("${test.config}")
    private String testConfig;

    @Autowired
    private Environment env;

    @Autowired
    private TrabalhadorRepository repository;

    @GetMapping("/config")
    public ResponseEntity<Void> getConfig() {
        logger.info("Pegando profile: "+testConfig);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Trabalhador>> findAll() {
        List<Trabalhador> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> findById(@PathVariable Long id){
        logger.info("PORT = "+ env.getProperty("local.server.port"));

        Trabalhador trabalhador = repository.findById(id).get();
        return ResponseEntity.ok(trabalhador);
    }
}
