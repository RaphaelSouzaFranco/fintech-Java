package com.fiap.projetofintech.model;
import java.time.LocalDateTime;

public class Investimento {
    // Atributos da classe
    String tipo;
    String descricao;
    LocalDateTime data;
    double valorInvestido;
    String vencimento;
    double rendimento;

    // Construtor da classe
    public Investimento(String tipo, String descricao, LocalDateTime data, double valorInvestido, String vencimento, double rendimento) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.valorInvestido = valorInvestido;
        this.vencimento = vencimento;
        this.rendimento = rendimento;
    }


    public void exibirInformacao() {
        System.out.println("\n--- Detalhes do Investimento ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Valor Investido: R$" + valorInvestido);
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Rendimento: " + rendimento + "% ao ano");
    }
}