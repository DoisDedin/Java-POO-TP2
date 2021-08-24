package com.company.components_models.estabelecimento.produto_servico;

import javax.swing.*;
import java.util.ArrayList;

public class Servico {
    private String nome;
    private String tempo;
    private double preco;
    private int qtd;

    public Servico(String nome, String tempo, double preco, int qtd){
        setNome(nome);
        setTempo(tempo);
        setPreco(preco);
        setQtd(qtd);
    }

    public Servico() {

    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setTempo(String tempo) {
        this.tempo = tempo;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public String getTempo() {
        return tempo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void gerarOrdem(ArrayList<Servico> servicos, int posi, int qtd){
        switch (posi) {
            case 0 -> servicos.get(0).setQtd(qtd);
            case 1 -> servicos.get(1).setQtd(qtd);
            case 2 -> servicos.get(2).setQtd(qtd);
        }
        JOptionPane.showMessageDialog(null, "Ordem gerada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
