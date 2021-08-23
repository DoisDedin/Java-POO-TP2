package com.company.ui.mainView.menus.vendedor;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVendas {
    private JPanel TelaVendasP;
    private JButton produtosButton;
    private JButton serviçosButton;
    private JButton voltarButton;

    public JFrame frame;

    private PrimeiraTela primeiraTela;
    private MenuVendedorTela menuVendedorTela;

    public TelaVendas(PrimeiraTela prim, MenuVendedorTela menVend) {
        primeiraTela = prim;
        menuVendedorTela = menVend;
    }

    public void TelaVendasGUI() {
        frame = new JFrame("Vendas");
        frame.setContentPane(TelaVendasP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListener(this);
    }

    public void setUpListener(TelaVendas tis){
        produtosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaProdutos prod = new TelaProdutos(primeiraTela, tis);
                prod.produtosTelaGUI();
            }
        });

        serviçosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaQuantidade serv = new TelaQuantidade(primeiraTela, tis);
                serv.servicosTelaGUI();
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuVendedorTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
