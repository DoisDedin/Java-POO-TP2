package com.company.components_models.estabelecimento.pessoas.funcionarios.veterinario;

import com.company.components_models.estabelecimento.pessoas.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Objects;

public class Veterinario extends Funcionario {
    private String user;
    private String senha;

    public Veterinario(String nome, String CPF, String tel, String cargo, double salario, String user, String senha) {
        super(nome, CPF, tel, cargo, salario);
        setUser(user);
        setSenha(senha);
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

    public void imprimeVeterinarioSimples(ArrayList<Veterinario> veterinarios){
        System.out.println("\t\tVeterinarios");
        for (Veterinario vet : veterinarios) {
            System.out.println("Nome: " + vet.getNome() + "CPF: " + vet.getCPF());
        }
    }

    public void imprimeVeterinarioCompleto(ArrayList<Veterinario> veterinarios){
        System.out.println("\t\tVeterinarios");
        for (Veterinario vet : veterinarios) {
            System.out.println("Nome: " + vet.getNome() + "CPF: " + vet.getCPF()+ "Telefone: " + vet.getTel() + "Cargo: " + vet.getCargo() + "Salario: R$ " + vet.getSalario());
        }
    }

    public void removeVeterinario(String nome, ArrayList<Veterinario> veterinarios){
        int i = 0;

        for (Veterinario vet : veterinarios) {
            if (Objects.equals(vet.getNome(), nome)){
                veterinarios.remove(i);
                break;
            }
            i++;
        }
    }
}
