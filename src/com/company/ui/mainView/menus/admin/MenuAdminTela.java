package com.company.ui.mainView.menus.admin;

import com.company.ui.mainView.entradaApp.LoginTela;
import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.habilidades.*;

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
    EstoqueTela estoqueTela;


    public MenuAdminTela(PrimeiraTela prim) {
        primeiraTela = prim;
    }

    public void mostraMenuAdminGUI() {
        frame = new JFrame("Menu - Admin");
        frame.setContentPane(menuAdminPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListeners(this);
    }

    private void setUpListeners(MenuAdminTela tis) {

        btnEstoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EstoqueTela estoqueTela = new EstoqueTela(primeiraTela, tis);
                estoqueTela.mostraEstoqueTelaGUI();
            }
        });

        btnCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostraClienteTela mostraClienteTela = new MostraClienteTela(primeiraTela, tis);
                mostraClienteTela.mostraClienteGUI();
            }
        });

        btnContas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarContasTela mostrarContasTela = new MostrarContasTela(primeiraTela,tis);
                mostrarContasTela.mostraContasTelaGUI();
            }
        });

        btnFuncionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostraFuncionarioTela mostraFuncionarioTela = new MostraFuncionarioTela(primeiraTela, tis);
                mostraFuncionarioTela.mostraFuncionariosTelaGUI();
            }
        });

        btnProdutosServico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarProdutoServicoTela mostrarProdutoServicoTela = new MostrarProdutoServicoTela(primeiraTela,tis);
                mostrarProdutoServicoTela.mostraProdutoServicoTelaGUI();
            }
        });
        btnVendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealizarVendaTela realizarVendaTela = new RealizarVendaTela(primeiraTela ,tis);
                realizarVendaTela.realizaVendasTelaGUI();
            }
        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiraTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });


    }


}
