package com.company.ui.mainView.menus.vendedor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastrarCliesnte extends javax.swing.JFrame {
    private JTextField nomeCliente;
    private JTextField cpfCliente;
    private JTextField telCliente;
    private JTextField qtdComprasCliente;
    private JPanel TelaCadastro;
    private JLabel nomeLabel;
    private JLabel CPFLabel;
    private JLabel telefoneLabel;
    private JLabel quantidadeDeComprasLabel;
    private JLabel CADASTRODECLIENTESLabel;
    private JButton confirmarButton;

    public JFrame frame;

    private String nome = "nulo";
    private String cpf = "nulo";
    private String tel = "nulo";
    private String qtdCompras = "nulo";
    private boolean confirmar = false;

    public void CadastraClienteGUI(){
        frame = new JFrame("Cadastro de clientes");
        frame.setContentPane(TelaCadastro);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        TelaCadastrarCliente(frame);
    }

    public void TelaCadastrarCliente(JFrame frame) {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nome = nomeCliente.getText();
                cpf = cpfCliente.getText();
                tel = telCliente.getText();
                qtdCompras = qtdComprasCliente.getText();
                confirmar = true;
                frame.setVisible(false);
            }
        });
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQtdCompras() {
        return qtdCompras;
    }

    public void setQtdCompras(String qtdCompras) {
        this.qtdCompras = qtdCompras;
    }


    public boolean isConfirmar() {
        return confirmar;
    }

    public void setConfirmar(boolean confirmar) {
        this.confirmar = confirmar;
    }
}
