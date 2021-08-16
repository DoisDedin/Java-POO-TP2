package com.company.components_models.estabelecimento.pessoas.funcionarios;

import com.company.components_models.estabelecimento.pessoas.Pessoa;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(String nome, String CPF, String tel, String cargo, double salario) {
        super(nome, CPF, tel);
        setCargo(cargo);
        setSalario(salario);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }
}
