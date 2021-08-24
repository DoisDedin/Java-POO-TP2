package com.company.components_models.estabelecimento.pessoas.clientes;

import com.company.components_models.estabelecimento.pessoas.Pessoa;

import javax.swing.*;
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

    public Cliente() {
        super();
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
            JOptionPane.showMessageDialog(null, "Nome: " + cliente.getNome() + "\tCPF: " + cliente.getCPF()+ "\tTelefone: " + cliente.getTel() + "\tNumero de compras: " + cliente.getQtdCompras(), "Cliente",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostraCliente(ArrayList<Cliente> clientes, String nome){
        for (Cliente cliente : clientes) {
            if (Objects.equals(cliente.getNome(), nome)){
                JOptionPane.showMessageDialog(null, "Nome:  " + cliente.getNome() + "  " + "CPF:  " + cliente.getCPF() + "  " + "Telefone:  " + cliente.getTel() + "  " + "Numero de compras:  " + cliente.getQtdCompras(), "Cliente",JOptionPane.INFORMATION_MESSAGE);
                //System.out.println();
            }
        }
    }
}
