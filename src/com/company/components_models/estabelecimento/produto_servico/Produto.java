package com.company.components_models.estabelecimento.produto_servico;

import java.util.ArrayList;
import java.util.Objects;

public class Produto {
    private String nome;
    private int qtd;
    private double preco;

    public Produto(String nome, int qtd, double preco){
        setNome(nome);
        setQtd(qtd);
        setPreco(preco);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void addNoEstoque(ArrayList<Produto> produtos, String nome, int qtd){
        for (Produto prod : produtos){
            if (Objects.equals(prod.getNome(), nome)){
                setQtd( prod.getQtd() + qtd);
                break;
            }
        }
    }

    public void tiraDoEstoque(ArrayList<Produto> produtos, String nome, int qtd){
        int i = 0;
        for (Produto prod : produtos){
            if (Objects.equals(prod.getNome(), nome)){
                if (prod.getQtd() < qtd){
                    System.out.println("A quantidade desejada excede o estabelecimento");
                    System.out.println("Quantidade em estabelecimento: " + prod.getQtd());
                }
                else produtos.get(i).setQtd(prod.getQtd() - qtd);
                break;
            }
            i++;
        }
    }
}
