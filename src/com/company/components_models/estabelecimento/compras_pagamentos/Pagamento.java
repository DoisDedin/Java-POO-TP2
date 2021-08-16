package com.company.components_models.estabelecimento.compras_pagamentos;

public class Pagamento {
    private String dataPagamento;
    private String dataVencimento;
    private String desc;

    public Pagamento(String dataPagamento, String dataVencimento, String desc){
        setDataPagamento(dataPagamento);
        setDataVencimento(dataVencimento);
        serDescricao(desc);
    }

    public void serDescricao(String desc) {
        this.desc = desc;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getDescricao() {
        return desc;
    }
}
