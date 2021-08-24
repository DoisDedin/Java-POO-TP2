package com.company.components_models.estabelecimento.produto_servico;

import javax.swing.*;
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

    public Produto() {

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

    public void addNoEstoque(ArrayList<Produto> produtos, String nome, int qtd, double preco){
        for (Produto prod : produtos){
            if (Objects.equals(prod.getNome(), nome)){
                setQtd( prod.getQtd() + qtd);
                setPreco(preco);
                break;
            }
            else {
                Produto aux = new Produto(nome, qtd, preco);
                produtos.add(aux);
            }
        }
    }

    public void tiraDoEstoque(ArrayList<Produto> produtos, String nome, int qtd){
        int i = 0;
        for (Produto prod : produtos){
            if (Objects.equals(prod.getNome(), nome)){
                if (prod.getQtd() < qtd){
                    JOptionPane.showMessageDialog(null, "A quantidade desejada excede o estabelecimento" + "\n" + "Quantidade em estabelecimento: " + prod.getQtd(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    produtos.get(i).setQtd(prod.getQtd() - qtd);
                    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }
            i++;
        }
    }

    public double buscaPreçoProduto(ArrayList<Produto> produtos, String nome){
        double aux = 0;
        for (Produto produto : produtos) {
            if (Objects.equals(produto.getNome(), nome)) {
                aux = produto.getPreco();
                break;
            }
        }
        return aux;
    }
}
