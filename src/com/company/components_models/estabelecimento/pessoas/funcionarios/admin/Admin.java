package com.company.components_models.estabelecimento.pessoas.funcionarios.admin;


import com.company.components_models.estabelecimento.pessoas.funcionarios.Funcionario;

public class Admin extends Funcionario {
    private String user;
    private String senha;

    public Admin(String nome, String CPF, String tel, String cargo, double salario, String user, String senha) {
        super(nome, CPF, tel, cargo, salario);
        setUser(user);
        setSenha(senha);
    }

    public void setUser(String user) {
        this.user = "admin";
    }

    public void setSenha(String senha) {
        this.senha = "admin";
    }

    public String getUser(){
        return user;
    }

    public String getSenha(){
        return senha;
    }
}
