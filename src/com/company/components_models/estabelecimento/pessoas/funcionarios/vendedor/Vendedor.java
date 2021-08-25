package com.company.components_models.estabelecimento.pessoas.funcionarios.vendedor;

import com.company.components_models.estabelecimento.pessoas.funcionarios.Funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Vendedor extends Funcionario {
    private String user;
    private String senha;

    public Vendedor(String nome, String CPF, String tel, String cargo, double salario, String user, String senha) {
        super(nome, CPF, tel, cargo, salario);
        setUser(user);
        setSenha(senha);
    }

    public Vendedor() {
        super();
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUser(){
        return user;
    }

    public String getSenha(){
        return senha;
    }

    public void imprimeVendedorSimples(ArrayList<Vendedor> vendedores){
        System.out.println("\t\tVendedores");
        for (Vendedor vender : vendedores) {
            System.out.println("Nome: " + vender.getNome() + "CPF: " + vender.getCPF());
        }
    }

    public void imprimeVendedorCompleto(ArrayList<Vendedor> vendedores, String nome){
        System.out.println("\t\tVendedores");
        for (Vendedor vender : vendedores) {
            if (Objects.equals(vender.getNome(), nome)){
                JOptionPane.showMessageDialog(null, "Nome: " + vender.getNome() + " " + "CPF: " + vender.getCPF()+ " " + "Telefone: " + vender.getTel() + "Cargo: " + vender.getCargo() + " " + "Salario: R$ " + vender.getSalario(), "Tosador",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void removeVendedor(String nome, ArrayList<Vendedor> vendedores){
        int i = 0;

        for (Vendedor vender : vendedores) {
            if (Objects.equals(vender.getNome(), nome)){
                vendedores.remove(i);
                break;
            }
            i++;
        }
    }
}
