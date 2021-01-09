package com.cursospringcloud.rhtrabalhador.resources;

import com.cursospringcloud.rhtrabalhador.entities.Trabalhador;
import com.cursospringcloud.rhtrabalhador.repositories.TrabalhadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

    @Autowired
    private TrabalhadorRepository repository;

    @GetMapping
    public ResponseEntity<List<Trabalhador>> findAll() {
        List<Trabalhador> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> findById(@PathVariable Long id){
        Trabalhador trabalhador = repository.findById(id).get();
        return ResponseEntity.ok(trabalhador);
    }
}
