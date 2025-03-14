package com.fiap.projetofintech.model;
import java.time.LocalDate;

public class Cartao {
    String bandeira;
    private double numero;
    private  String nome;
    private LocalDate dataVencimento;
    private int cvc;


    public Cartao(String bandeira, double numero, String nome, LocalDate dataVencimento, int cvc){
        this.bandeira = bandeira;
        this.numero = numero;
        this.nome = nome;
        this.dataVencimento = dataVencimento;
        this.cvc = cvc;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void inserirCartao (){
        System.out.println("Digite a bandeira do cartão:");
        System.out.println("Digite o numero do cartão:");
        System.out.println("Digite o nome no cartão:");
        System.out.println("Digite a data de vencimento do cartão:");
        System.out.println("Digite o cvc do cartão:");
    }
}

