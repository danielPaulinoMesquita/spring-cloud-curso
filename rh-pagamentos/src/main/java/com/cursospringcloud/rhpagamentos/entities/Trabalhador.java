package com.cursospringcloud.rhpagamentos.entities;

import java.io.Serializable;


public class Trabalhador implements Serializable {

    private Long id;
    private String nome;
    private Double ganhoDiario;

    public Trabalhador(){

    }

    public Trabalhador(Long id, String nome, Double ganhoDiario) {
        this.id = id;
        this.nome = nome;
        this.ganhoDiario = ganhoDiario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGanhoDiario() {
        return ganhoDiario;
    }

    public void setGanhoDiario(Double ganhoDiario) {
        this.ganhoDiario = ganhoDiario;
    }
}
