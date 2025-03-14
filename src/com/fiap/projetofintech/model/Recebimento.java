package com.fiap.projetofintech.model;

public class Recebimento {
    private double valor;
    private String data;
    private String origem;

    public Recebimento(double valor, String data, String origem) {
        this.valor = valor;
        this.data = data;
        this.origem = origem;
    }

    public void exibirDados() {
        System.out.println("Valor: R$" + valor);
        System.out.println("Data: " + data);
        System.out.println("Origem: " + origem);
    }
}
