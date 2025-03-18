package com.fiap.projetofintech.model;

public class DespesasFintech extends Gasto {
    private String dataPagamento;
    private String categoria;
    private String formaPagamento;
    private boolean status;

    public DespesasFintech(String dataPagamento, String descricao, double valor, String categoria, String formaPagamento, boolean pago) {
        super(descricao, valor);
        this.dataPagamento = dataPagamento;
        this.categoria = categoria;
        this.formaPagamento = formaPagamento;
        this.status = pago;
    }

    public DespesasFintech() {}

    public void exibirGastos() {
        System.out.println("Data do Pagamento: " + dataPagamento);
        super.exibirGasto();
        System.out.println("Categoria: " + categoria);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Status: " + (status ? "Pago" : "Pendente"));
    }

    public void pagarDespesa() {
        if (!status) {
            status = true;
            System.out.println("Despesa marcada como paga.");
        } else {
            System.out.println("Despesa já estava paga.");
        }
    }

    // Getters e Setters
    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
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
}

