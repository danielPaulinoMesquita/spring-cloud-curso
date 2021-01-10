package com.cursospringcloud.rhpagamentos.feignclients;

import com.cursospringcloud.rhpagamentos.entities.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "rh-trabalhador", url = "localhost:8001", path = "/trabalhadores")
public interface TrabalhadorFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Trabalhador> findById(@PathVariable Long id);
}
