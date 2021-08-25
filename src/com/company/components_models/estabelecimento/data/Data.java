package com.company.components_models.estabelecimento.data;
import com.company.components_models.estabelecimento.compras_pagamentos.Pagamento;
import com.company.components_models.estabelecimento.pessoas.clientes.Cliente;
import com.company.components_models.estabelecimento.pessoas.funcionarios.admin.Admin;
import com.company.components_models.estabelecimento.pessoas.funcionarios.tosador.Tosador;
import com.company.components_models.estabelecimento.pessoas.funcionarios.vendedor.Vendedor;
import com.company.components_models.estabelecimento.pessoas.funcionarios.veterinario.Veterinario;
import com.company.components_models.estabelecimento.produto_servico.Produto;
import com.company.components_models.estabelecimento.produto_servico.Servico;
//import com.company.ui.mainView.menus.vendedor.TelaCadastrarCliesnte;

import javax.swing.*;
import java.util.ArrayList;

public class Data {



    //fazer a criação das listaas e tals
    private Admin admin;
    private ArrayList<Vendedor> vendedor;
    private ArrayList<Veterinario> veterinario;
    private ArrayList<Tosador> tosador;
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Servico> servicos;
    private ArrayList<String> informacoes;
    private ArrayList<Pagamento> contas;

    public Data(ArrayList<Vendedor> vendedor, ArrayList<Veterinario> veterinario, ArrayList<Tosador> tosador, ArrayList<Cliente> clientes, Admin admin, ArrayList<Produto> produtos, ArrayList<Servico> servicos, ArrayList<Pagamento> contas){

        vendedor = new ArrayList<Vendedor>();
        veterinario = new ArrayList<Veterinario>();
        tosador = new ArrayList<Tosador>();
        clientes = new ArrayList<Cliente>();
        produtos = new ArrayList<Produto>();
        servicos = new ArrayList<Servico>();
        contas = new ArrayList<Pagamento>();

        this.vendedor = vendedor;
        this.veterinario = veterinario;
        this.tosador = tosador;
        this.clientes = clientes;
        this.admin = admin;
        this.produtos = produtos;
        this.servicos = servicos;
        this.contas = contas;
    }
    public Data(){
        vendedor = new ArrayList<>();
        veterinario = new ArrayList<>();
        tosador = new ArrayList<>();
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        servicos = new ArrayList<>();
        informacoes = new ArrayList<>();
        contas = new ArrayList<>();

        //cria o ADMIN padrão
        admin = new Admin("Juanesio","219219","(33)3236-1487","Administrador",7000.0,"admin", "admin");

        //cria VENDEDORES
        Vendedor vet = new Vendedor("Joao da Mata", "15578922230", "(23)40891-7331", "vendedor", 1200.10, "vend1", "5533");
        vendedor.add(vet);
        vet = new Vendedor("Bryan O'Conner", "84221454059", "(10)55022-2023", "vendedor", 1250.10, "vend2", "1973");
        vendedor.add(vet);

        //cria VETERINARIOS
        Veterinario vet1 = new Veterinario("Paolo Guerrero", "43325489060", "(26)76518-5348", "veterinario", 3230.0, "vet2", "1984");
        veterinario.add(vet1);
        vet1 = new Veterinario("Hinata Hyuga", "75807674065", "(72)79764-9945", "veterinario", 3250.0, "vet1", "1113");
        veterinario.add(vet1);

        //cria TOSADORES
        Tosador vet2 = new Tosador("Larissa Silva", "29619550099", "(20)75743-8099", "tosador", 1100.0);
        tosador.add(vet2);
        vet2 = new Tosador("Carlos Eduardo", "06733613069", "(77)26843-9252", "tosador", 1100.0);
        tosador.add(vet2);

        //cria CLIENTES
        Cliente vet3 = new Cliente("Paulo Plinio", "37283338080", "(60)47950-4741", 10);
        clientes.add(vet3);
        vet3 = new Cliente("Paula Muller", "39521401044", "(82)26615-9145", 5);
        clientes.add(vet3);

        //cria a lista de produtos iniciais
        Produto vet4 = new Produto("Coleira", 35, 23.45);
        produtos.add(vet4);
        vet4 = new Produto("Sabonete", 42, 10.50);
        produtos.add(vet4);
        vet4 = new Produto("Mordedor", 15, 8.35);
        produtos.add(vet4);
        vet4 = new Produto("Racao", 150, 98.10);
        produtos.add(vet4);

        //cria os serciços
        Servico vet5 = new Servico("Banho", "25 Min", 85.30, 0);
        servicos.add(vet5);
        vet5 = new Servico("Tosa", "12 Min", 58.15, 0);
        servicos.add(vet5);
        vet5 = new Servico("Consulta", "tempo variado", 158.58, 0);
        servicos.add(vet5);

        Pagamento vet6 = new Pagamento("23/08/2021", "20/08/2021", "Conta de luz");
        contas.add(vet6);
        vet6 = new Pagamento("05/08/2021", "25/08/2021", "Fornecedores");
        contas.add(vet6);
        vet6 = new Pagamento("08/08/2021", "15/08/2021", "Internet");
        contas.add(vet6);
        vet6 = new Pagamento("10/08/2021", "10/08/2021", "Conta de água");
        contas.add(vet6);
    }
    //criar metodos para a inserção e obtenção desses valores

    public ArrayList<Vendedor> getVendedor(){
        return vendedor;
    }
    public void setVendedor(ArrayList<Vendedor>vendedor){
        this.vendedor = vendedor;
    }
    public ArrayList<Veterinario> getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(ArrayList<Veterinario> veterinario) {
        this.veterinario = veterinario;
    }
    public ArrayList<Tosador> getTosador() {
        return tosador;
    }
    public void setTosador(ArrayList<Tosador> tosador) {
        this.tosador = tosador;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Admin getAdmin() {
        return admin;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos){
        this.produtos = produtos;
    }
    public ArrayList<Servico> getServicos(){
        return servicos;
    }
    public void setServicos(ArrayList<Servico> servicos){
        this.servicos = servicos;
    }
    public ArrayList<Pagamento> getContas(){
        return contas;
    }
    public void setContas(ArrayList<Pagamento> contas){
        this.contas = contas;
    }

    public ArrayList<String> getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(ArrayList<String> informacoes) {
        this.informacoes = informacoes;
    }

    //verifica se o veterinario existe
    public boolean existeVeterinario(String login, String senha){
        for (Veterinario value : veterinario) {
            if (login.equals(value.getUser()) && senha.equals(value.getSenha())) {
                return true;
            }
        }
        return false;
    }

    //verifica se o vendedor existe
    public boolean existeVendedor(String login, String senha){
        for (Vendedor value : vendedor) {
            if (login.equals(value.getUser()) && senha.equals(value.getSenha())) {
                return true;
            }
        }
        return false;
    }

    //cadastra novo um cliente
    public  void newCliente(String nome, String cpf, String telefone , int qtdCompras){

        Cliente add = new Cliente(nome, cpf, telefone, qtdCompras);
        boolean verification = clientes.add(add);

        //add.imprimeClientesCompleto(clientes);

        if (!verification){
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSIVEL CADASTRAR CLIENTE", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "CLIENTE CADASTRADO", "Cadastro",JOptionPane.PLAIN_MESSAGE);
   }

   //realiza a venda de um produto
    public void vendeProduto(String nome, int qtdProdutos){
        Produto prod = new Produto();
        prod.tiraDoEstoque(produtos, nome, qtdProdutos);
    }

    //realiza a venda de um serviço
    public void vendeServicos(String nome, int qtdAnimais){
        Servico serv = new Servico();
        int posi;
        if (nome.equals("Banho")){
            posi = 0;
        }
        else if (nome.equals("Tosa")){
            posi = 1;
        }
        else posi = 2;
        serv.gerarOrdem(servicos, posi, qtdAnimais);
    }

    public void buscaCliente(String nome){
        Cliente busca = new Cliente();
        busca.mostraCliente(clientes, nome);
    }

    public void buscaFuncionario(String nome){
        Vendedor aux = new Vendedor();
        Veterinario aux2 = new Veterinario();
        Tosador aux3 = new Tosador();

        aux.imprimeVendedorCompleto(vendedor, nome);
        aux2.imprimeVeterinarioCompleto(veterinario, nome);
        aux3.imprimeTosadorCompleto(tosador, nome);
    }

    public double retornaPrecoConsulta(){
        return servicos.get(2).getPreco();
    }

    public int retornaQuantidadeConsulta(){
        return servicos.get(2).getQtd();
    }

    public void guardaInfoConsulta(String Info){
        informacoes.add(Info);
    }

    public double retornaPrecoTotal(String nome, int qtd){
        Produto aux = new Produto();
        return (aux.buscaPreçoProduto(produtos, nome) * qtd);
    }

    public double retonaPrecoServ(String nome, int qtd){
        Servico aux = new Servico();
        return (aux.buscaPrecoServico(servicos, nome) * qtd);
    }

    public void addProdEstoque(String nome, int qtd, double preco){
        Produto aux = new Produto(nome, qtd, preco);
        produtos.add(aux);
    }

    public void newFuncionario(String nome, String cpf, String tel, String cargo, double salario, String user, String senha){
        switch (cargo) {
            case "vendedor" -> {
                Vendedor aux = new Vendedor(nome, cpf, tel, cargo, salario, user, senha);
                vendedor.add(aux);
                break;
            }
            case "veterinario" -> {
                Veterinario aux = new Veterinario(nome, cpf, tel, cargo, salario, user, senha);
                veterinario.add(aux);
                break;
            }
            case "tosador" -> {
                Tosador aux = new Tosador(nome, cpf, tel, cargo, salario);
                tosador.add(aux);
                break;
            }
        }
    }

    public String retQtd(){
        int aux = 0;
        for (Produto produto : produtos) {
            aux += produto.getQtd();
        }
        return String.valueOf(aux);
    }

    public String retValor(){
        double t = 0;
        for (Produto produto : produtos) {
            t += produto.getQtd() * produto.getPreco();
        }
        return String.valueOf(t);
    }

    public String retQtdServ(){
        int aux = 0;
        for (Servico serv : servicos) {
            aux += serv.getQtd();
        }
        return String.valueOf(aux);
    }

    public String retValorServ(){
        double t = 0;
        for (Servico serv : servicos) {
            t += serv.getQtd() * serv.getPreco();
        }
        return String.valueOf(t);
    }

    public String retLucro(){
        double aux = Double.parseDouble(retValor()) * Double.parseDouble(retValorServ());
        return String.valueOf(aux);
    }
}
