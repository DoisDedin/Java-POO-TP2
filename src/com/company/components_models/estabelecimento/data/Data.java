package com.company.components_models.estabelecimento.data;
import com.company.components_models.estabelecimento.pessoas.clientes.Cliente;
import com.company.components_models.estabelecimento.pessoas.funcionarios.admin.Admin;
import com.company.components_models.estabelecimento.pessoas.funcionarios.tosador.Tosador;
import com.company.components_models.estabelecimento.pessoas.funcionarios.vendedor.Vendedor;
import com.company.components_models.estabelecimento.pessoas.funcionarios.veterinario.Veterinario;
import com.company.components_models.estabelecimento.produto_servico.Produto;
import com.company.components_models.estabelecimento.produto_servico.Servico;
//import com.company.ui.mainView.menus.vendedor.TelaCadastrarCliesnte;

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

    public Data(ArrayList<Vendedor> vendedor, ArrayList<Veterinario> veterinario, ArrayList<Tosador> tosador, ArrayList<Cliente> clientes, Admin admin, ArrayList<Produto> produtos, ArrayList<Servico> servicos){

        vendedor = new ArrayList<Vendedor>();
        veterinario = new ArrayList<Veterinario>();
        tosador = new ArrayList<Tosador>();
        clientes = new ArrayList<Cliente>();
        produtos = new ArrayList<Produto>();
        servicos = new ArrayList<Servico>();

        this.vendedor = vendedor;
        this.veterinario = veterinario;
        this.tosador = tosador;
        this.clientes = clientes;
        this.admin = admin;
        this.produtos = produtos;
        this.servicos = servicos;
    }
    public Data(){
        vendedor = new ArrayList<>();
        veterinario = new ArrayList<>();
        tosador = new ArrayList<>();
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        servicos = new ArrayList<>();

        admin = new Admin("Juanesio","219219","(33)3236-1487","Administrador",7000.0,"admin", "admin");

        Vendedor vet = new Vendedor("Joao da Mata", "15578922230", "(23)40891-7331", "vendedor", 1200.10, "vend1", "5533");
        vendedor.add(vet);
        vet = new Vendedor("Bryan O'Conner", "84221454059", "(10)55022-2023", "vendedor", 1250.10, "vend2", "1973");
        vendedor.add(vet);

        Veterinario vet1 = new Veterinario("Paolo Guerrero", "43325489060", "(26)76518-5348", "veterinario", 3230.0, "vet2", "1984");
        veterinario.add(vet1);
        vet1 = new Veterinario("Hinata Hyuga", "75807674065", "(72)79764-9945", "veterinario", 3250.0, "vet1", "1113");
        veterinario.add(vet1);

        Tosador vet2 = new Tosador("Larissa Silva", "29619550099", "(20)75743-8099", "tosador", 1100.0);
        tosador.add(vet2);
        vet2 = new Tosador("Carlos Eduardo", "06733613069", "(77)26843-9252", "tosador", 1100.0);
        tosador.add(vet2);

        Cliente vet3 = new Cliente("Paulo Plinio", "37283338080", "(60)47950-4741", 10);
        clientes.add(vet3);
        vet3 = new Cliente("Paula Muller", "39521401044", "(82)26615-9145", 5);
        clientes.add(vet3);

        Produto vet4 = new Produto("Coleira", 35, 23.45);
        produtos.add(vet4);
        vet4 = new Produto("Sabonete", 42, 10.50);
        produtos.add(vet4);
        vet4 = new Produto("Mordedor", 15, 8.35);
        produtos.add(vet4);
        vet4 = new Produto("Racao", 150, 98.10);
        produtos.add(vet4);

        Servico vet5 = new Servico("Banho", "25 Min", 85.30, 0);
        servicos.add(vet5);
        vet5 = new Servico("Tosa", "12 Min", 58.15, 0);
        servicos.add(vet5);
        vet5 = new Servico("Consulta", "tempo variado", 158.58, 0);
        servicos.add(vet5);
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

    public boolean existeVeterinario(String login, String senha){
        return true;
    }

    public boolean existeVendedor(String login, String senha){
        return true;
    }

    public  void newCliente(String nome, String cpf, String telefone , Integer qtdCompras){
//        TelaCadastrarCliesnte novo = new TelaCadastrarCliesnte();
//        novo.setVisible(true);
//
//        while ("nulo".equals(novo.getNome()) && "nulo".equals(novo.getCpf()) && "nulo".equals(novo.getTel()) && "nulo".equals(novo.getQtdCompras())){
//            System.out.println(novo.getNome() + " " + novo.getCpf() + " " + novo.getTel() + " " + novo.getQtdCompras());
//        }
//
//        int qtd = Integer.parseInt(novo.getQtdCompras());
//        Cliente add = new Cliente(novo.getNome(), novo.getCpf(), novo.getTel(), qtd);
//        boolean verification = clientes.add(add);
//
//        if (!verification){
//            JOptionPane.showMessageDialog(null, "NÃO FOI POSSIVEL CADASTRAR CLIENTE", "Error",JOptionPane.ERROR_MESSAGE);
//        }
//        else JOptionPane.showMessageDialog(null, "CLIENTE CADASTRADO", "Cadastro",JOptionPane.PLAIN_MESSAGE);
   }


}
