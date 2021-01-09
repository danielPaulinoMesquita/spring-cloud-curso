package com.cursospringcloud.rhpagamentos.resources;

import com.cursospringcloud.rhpagamentos.entities.Pagamento;
import com.cursospringcloud.rhpagamentos.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource {

    @Autowired
    private PagamentoService service;

    @GetMapping(value = "/{idTrabalhador}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable long idTrabalhador, @PathVariable Integer dias){
        Pagamento pagamento = service.getPagamento(idTrabalhador, dias);
        return ResponseEntity.ok(pagamento);
    }

}
