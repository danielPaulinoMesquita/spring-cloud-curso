package com.cursospringcloud.rhpagamentos.services;

import com.cursospringcloud.rhpagamentos.entities.Pagamento;
import com.cursospringcloud.rhpagamentos.entities.Trabalhador;
import com.cursospringcloud.rhpagamentos.feignclients.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private TrabalhadorFeignClient trabalhadorFeignClient;

    public Pagamento getPagamento(long idTrabalhador, int dias){
        Trabalhador trabalhador = trabalhadorFeignClient.findById(idTrabalhador).getBody();
        return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoDiario(), dias);
    }

}
