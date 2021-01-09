package com.cursospringcloud.rhpagamentos.entities;

public class Pagamento {

    private String nome;
    private Double ganhoDiario;
    private Integer dias;

    public Pagamento(){

    }

    public Pagamento(String nome, Double ganhoDiario, Integer dias) {
        this.nome = nome;
        this.ganhoDiario = ganhoDiario;
        this.dias = dias;
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

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public double getToital(){
        return dias * ganhoDiario;
    }
}
