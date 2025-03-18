package com.fiap.projetofintech.model;

public class Gasto { private String descricaoDespesa;
    private double valor;

    public Gasto(String descricaoDespesa, double valor) {
        if (descricaoDespesa == null || descricaoDespesa.isEmpty()) {
            descricaoDespesa = "Descrição não fornecida";
        }
        this.descricaoDespesa = descricaoDespesa;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricaoDespesa;
    }

    public void setDescricao(String descricao) {
        this.descricaoDespesa = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Gasto() {
    }

    public void exibirGasto() {
        System.out.println("Descrição: " + descricaoDespesa);
        System.out.println("Valor: " + valor);
    }
}

