package com.fiap.projetofintech.model;
import java.time.LocalDateTime;

public class Investimento {
    private String tipo;
    private String descricao;
    private LocalDateTime data;
    private double valorInvestido;
    private String vencimento;
    private double rendimento;

    public Investimento(String tipo, String descricao, LocalDateTime data, double valorInvestido, String vencimento, double rendimento){
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.valorInvestido = valorInvestido;
        this.vencimento = vencimento;
        this.rendimento = rendimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void exibirInformacao(){
        System.out.println("Tipo:" + tipo);
        System.out.println("Descrição:" + descricao);
        System.out.println("Data:" + data);
        System.out.println("Valor:" + valorInvestido);
        System.out.println("Vencimento:" + vencimento);
        System.out.println("Rendimento:" + rendimento);

    }
}

