package com.fiap.projetofintech.model;
import java.time.LocalDate;

public class Cartao {
    String bandeira;
    private double numero;
    String nome;
    LocalDate dataVencimento;
    private int cvc;


    public Cartao(String bandeira, double numero, String nome, LocalDate dataVencimento, int cvc){
        this.bandeira = bandeira;
        this.numero = numero;
        this.nome = nome;
        this.dataVencimento = dataVencimento;
        this.cvc = cvc;
    }

    public void inserirCartao (){
        System.out.println("Digite a bandeira do cartão:");
        System.out.println("Digite o numero do cartão:");
        System.out.println("Digite o nome no cartão:");
        System.out.println("Digite a data de vencimento do cartão:");
        System.out.println("Digite o cvc do cartão:");
    }
}

