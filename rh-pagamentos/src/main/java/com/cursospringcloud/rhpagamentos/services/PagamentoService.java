package com.cursospringcloud.rhpagamentos.services;

import com.cursospringcloud.rhpagamentos.entities.Pagamento;
import com.cursospringcloud.rhpagamentos.entities.Trabalhador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {

    @Value("${rh-trabalhador.host}")
    private String trabalahadorHost;

    @Autowired
    private RestTemplate restTemplate;

    public Pagamento getPagamento(long idTrabalhador, int dias){
        // Criando o mapa com os valores necessários para requisição ou
        // endpoint de busca dos trabalhadores (no caso o endpoint precisa do {id})
        Map<String, String> uriVariaveis = new HashMap<>();
        uriVariaveis.put("id", ""+idTrabalhador);

        Trabalhador trabalhador = restTemplate.getForObject(trabalahadorHost+"/trabalhadores/{id}",Trabalhador.class,uriVariaveis);
        return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoDiario(), dias);
    }
}
