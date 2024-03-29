package com.cursospringcloud.rhpagamentos.feignclients;

import com.cursospringcloud.rhpagamentos.entities.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "rh-trabalhador")
public interface TrabalhadorFeignClient {

    @GetMapping(value = "/trabalhadores/{id}")
    ResponseEntity<Trabalhador> findById(@PathVariable Long id);
}
