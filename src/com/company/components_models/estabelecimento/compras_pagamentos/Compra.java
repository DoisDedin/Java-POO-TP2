package com.company.components_models.estabelecimento.compras_pagamentos;

import com.company.components_models.estabelecimento.produto_servico.Produto;

public class Compra extends Produto {
    int qtdParaAdd;

    public Compra(String nome, int qtd, double preco, int qtdParaAdd) {
        super(nome, qtd, preco);
        setQtdParaAdd(qtdParaAdd);
    }

    public void setQtdParaAdd(int qtdParaAdd) {
        this.qtdParaAdd = qtdParaAdd;
    }

    public int getQtdParaAdd(){
        return qtdParaAdd;
    }

    public void addNoEstoque(int qtdParaAdd, int qtd){
        setQtd(qtd + qtdParaAdd);
    }
}
