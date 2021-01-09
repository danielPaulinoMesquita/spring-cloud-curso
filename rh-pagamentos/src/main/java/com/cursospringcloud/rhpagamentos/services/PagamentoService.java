package com.cursospringcloud.rhpagamentos.services;

import com.cursospringcloud.rhpagamentos.entities.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    public Pagamento getPagamento(long idTrabalhador, int dias){
        return new Pagamento("Bob", 200.0, dias);
    }
}
