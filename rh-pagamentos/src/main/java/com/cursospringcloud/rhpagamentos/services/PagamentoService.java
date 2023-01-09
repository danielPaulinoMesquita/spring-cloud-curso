package com.cursospringcloud.rhpagamentos.services;

import com.cursospringcloud.rhpagamentos.entities.Pagamento;
import com.cursospringcloud.rhpagamentos.entities.Trabalhador;
import com.cursospringcloud.rhpagamentos.feignclients.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {

    /**
     * host(porta) do microserviço que desejamos consumir
     * declarado no properties
     */
    @Value("${rh-trabalhador.host}")
    private String hostRestTrabalhador;

    @Autowired
    private TrabalhadorFeignClient trabalhadorFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Chamada usando FeignClient, outra forma de comunicar
     * @param idTrabalhador
     * @param dias
     * @return
     */
    public Pagamento getPagamento(long idTrabalhador, int dias){
        Trabalhador trabalhador = trabalhadorFeignClient.findById(idTrabalhador).getBody();
        return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoDiario(), dias);
    }

    /**
     * Chamada usando RestTemplate, uma forma de comunicar
     * com outro microserviço
     * @param idTrabalhador
     * @param dias
     * @return
     */
    public Pagamento getPagamentoByRestTemplate(long idTrabalhador, int dias){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+idTrabalhador);

        Trabalhador trabalhador = restTemplate
                .getForObject(
                        hostRestTrabalhador+"/trabalhadores/{id}",
                        Trabalhador.class,
                        uriVariables);

        return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoDiario(), dias);
    }

}
