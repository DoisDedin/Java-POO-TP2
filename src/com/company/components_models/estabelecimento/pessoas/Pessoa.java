package com.company.components_models.estabelecimento.pessoas;

public class Pessoa {
    private String nome;
    private String CPF;
    private String tel;

    public Pessoa(String nome, String CPF, String tel){
        setNome(nome);
        setCPF(CPF);
        setTel(tel);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getNome(){
        return nome;
    }

    public String getCPF(){
        return CPF;
    }

    public String getTel(){
        return tel;
    }
}
