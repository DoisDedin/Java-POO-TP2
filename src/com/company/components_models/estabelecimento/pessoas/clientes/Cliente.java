package com.company.components_models.estabelecimento.pessoas.clientes;

import com.company.components_models.estabelecimento.pessoas.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private int qtdCompras;

    public Cliente(String nome, String CPF, String tel, int qtdCompras){
        super(nome, CPF, tel);
        setQtdCompras(qtdCompras);
    }

    public void setQtdCompras(int qtdCompras){
        this.qtdCompras = qtdCompras;
    }

    public int getQtdCompras(){
        return qtdCompras;
    }

    public void imprimeClientesSimples(ArrayList<Cliente> clientes){
        System.out.println("\t\tClientes");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + "CPF: " + cliente.getCPF());
        }
    }

    public void imprimeClientesCompleto(ArrayList<Cliente> clientes){
        System.out.println("\t\tClientes");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + "CPF: " + cliente.getCPF()+ "Telefone: " + cliente.getTel() + "Numero de compras: " + cliente.getQtdCompras());
        }
    }

    public void mostraCliente(ArrayList<Cliente> clientes, String nome){
        for (Cliente cliente : clientes) {
            if (Objects.equals(cliente.getNome(), nome)){
                System.out.println("Nome: " + cliente.getNome() + "CPF: " + cliente.getCPF()+ "Telefone: " + cliente.getTel() + "Numero de compras: " + cliente.getQtdCompras());
            }
        }
    }
}
