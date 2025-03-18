package com.fiap.projetofintech.model;

public class Gasto { private String descricaoDespesa;
    private double valor;
    private String categoria;
    private String formaPagamento;
    private boolean status;

    public Gasto(String descricaoDespesa, double valor) {
        if (descricaoDespesa == null || descricaoDespesa.isEmpty()) {
            descricaoDespesa = "Descrição não fornecida";
        }
        this.descricaoDespesa = descricaoDespesa;
        this.valor = valor;
        this.categoria = categoria;
        this.formaPagamento = formaPagamento;
        this.status = pago;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibirGastos() {
        System.out.println("Data do Pagamento: " + data);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Status: " + (status ? "Pago" : "Pendente"));
    }

    // metodp para marcar a despesa como paga
    public void pagarDespesa() {
        if (!status) {
            status = true;
            System.out.println("Despesa marcada como paga.");
        } else {
            System.out.println("Despesa já estava paga.");
        }
    }
}