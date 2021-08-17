package com.company.ui.mainView.menus.admin;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;

public class MenuAdminTela extends javax.swing.JFrame {
    private JPanel menuPanel;
    private JButton btnEstoque;
    private JButton btnCliente;
    private JButton btnFuncionarios;
    private JButton btnContas;
    private JButton btnProdutosServico;
    private JButton btnVendas;
    private JButton btnVoltar;

    public void mostraMenuAdmin() {
        JFrame frame = new JFrame("Loguin");
        frame.setContentPane(new MenuAdminTela().menuPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
