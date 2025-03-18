package com.fiap.projetofintech.model;

public class MetaCliente {
    private String nomeMeta;
    private double valorMeta;
    private int prazoMeses;

    public MetaCliente(String definirMeta, double valorMeta, int prazoMeses) {
        this.definirMeta = definirMeta;
        this.valorMeta = valorMeta;
        this.prazoMeses = prazoMeses;
    }

    public String getDefinirMeta() {
        return definirMeta;
    }

    public void setDefinirMeta(String definirMeta) {
        this.definirMeta = definirMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public void exibirMeta(){
        System.out.println("Meta: " + definirMeta + ", Valor Total: " + valorMeta + ",Prazo Meses: " + prazoMeses);
    }

}

