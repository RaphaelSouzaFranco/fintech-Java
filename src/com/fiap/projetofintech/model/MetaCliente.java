package com.fiap.projetofintech.model;

public class MetaCliente {
    private String definirMeta;
    private double valorMeta;
    private int prazoMeses;

    public MetaCliente(String definirMeta, double valorMeta, int prazoMeses) {
        this.definirMeta = definirMeta;
        this.valorMeta = valorMeta;
        this.prazoMeses = prazoMeses;
    }
    public void exibirMeta(){
        System.out.println("Meta: " + definirMeta + ", Valor Total: " + valorMeta + ",Prazo Meses: " + prazoMeses);
    }

}

