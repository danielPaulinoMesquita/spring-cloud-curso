package com.cursospringcloud.rhpagamentos.resources;

import com.cursospringcloud.rhpagamentos.entities.Pagamento;
import com.cursospringcloud.rhpagamentos.services.PagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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


    @HystrixCommand(fallbackMethod = "fallback_teste",
            commandProperties = {
                    @HystrixProperty(
                            name = "execution.isolation.thread.timeoutInMilliseconds",
                            value = "3000")
            }
    )
    @GetMapping(value = "/{idTrabalhador}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable long idTrabalhador, @PathVariable Integer dias){
        Pagamento pagamento = service.getPagamento(idTrabalhador, dias);
        return ResponseEntity.ok(pagamento);
    }

    @HystrixCommand(fallbackMethod = "fallback_teste",
            commandProperties = {
                    @HystrixProperty(
                            name = "execution.isolation.thread.timeoutInMilliseconds",
                            value = "3000")
            }
    )
    @GetMapping(value = "/tst")
    public ResponseEntity<?> getPagamento() throws InterruptedException{
        Thread.sleep(3500);
        String resp = "TESTANDO";
        return ResponseEntity.ok(resp);
    }

    private ResponseEntity<?>  fallback_teste() {
        return ResponseEntity.ok("testando o hystrix e vendo como funciona");
    }

    private ResponseEntity<Pagamento>  fallback_teste(long idTrabalhador, Integer dias) {
        Pagamento pagamento = new Pagamento("Teste", 2000.00, 5);
        return ResponseEntity.ok(pagamento);
    }

}
