package com.cursospringcloud.rhtrabalhador.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_trabalhador")
public class Trabalhador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
