package com.company.ui.mainView.menus.admin;

import com.company.ui.mainView.entradaApp.LoginTela;
import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdminTela extends javax.swing.JFrame {
    private JPanel menuAdminPanel;
    private JButton btnEstoque;
    private JButton btnCliente;
    private JButton btnFuncionarios;
    private JButton btnContas;
    private JButton btnProdutosServico;
    private JButton btnVendas;
    private JButton btnVoltar;

    JFrame frame;
    PrimeiraTela primeiraTela;

    public MenuAdminTela(){

    }
    public void mostraMenuAdminGUI(PrimeiraTela primeiraTela) {
        this.primeiraTela = primeiraTela;

        frame = new JFrame("Menu - Admin");
        frame.setContentPane(menuAdminPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListeners();
    }

    private void setUpListeners(){
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiraTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }


}
