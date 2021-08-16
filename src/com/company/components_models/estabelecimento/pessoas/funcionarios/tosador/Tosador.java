package com.company.components_models.estabelecimento.pessoas.funcionarios.tosador;

import com.company.components_models.estabelecimento.pessoas.clientes.Cliente;
import com.company.components_models.estabelecimento.pessoas.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Objects;

public class Tosador extends Funcionario {
    public Tosador(String nome, String CPF, String tel, String cargo, double salario) {
        super(nome, CPF, tel, cargo, salario);
    }

    public void imprimeTosadorSimples(ArrayList<Tosador> tosadores){
        System.out.println("\t\tTosadores");
        for (Tosador tosar : tosadores) {
            System.out.println("Nome: " + tosar.getNome() + "CPF: " + tosar.getCPF());
        }
    }

    public void imprimeTosadorCompleto(ArrayList<Tosador> tosadores){
        System.out.println("\t\tTosadores");
        for (Tosador tosar : tosadores) {
            System.out.println("Nome: " + tosar.getNome() + "CPF: " + tosar.getCPF()+ "Telefone: " + tosar.getTel() + "Cargo: " + tosar.getCargo() + "Salario: R$ " + tosar.getSalario());
        }
    }

    public void removeTosador(String nome, ArrayList<Tosador> tosadores){
        int i = 0;

        for (Tosador tosar : tosadores) {
            if (Objects.equals(tosar.getNome(), nome)){
                tosadores.remove(i);
                break;
            }
            i++;
        }
    }
}
