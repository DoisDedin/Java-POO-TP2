package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;
import com.company.ui.mainView.menus.vendedor.TelaProdutos;
import com.company.ui.mainView.menus.vendedor.TelaQuantidade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealizarVendaTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    public JFrame frame;

    private JPanel TelaVendasP;
    private JButton produtosButton;
    private JButton serviçosButton;
    private JButton voltarButton;

    public RealizarVendaTela(PrimeiraTela prim, MenuAdminTela menuAdmin) {
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void realizaVendasTelaGUI(){
        frame = new JFrame("Vendas");
        frame.setContentPane(TelaVendasP);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener(this);
    }

    private void setUpListener(RealizarVendaTela tis){
        produtosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VendaProdutoTela prod = new VendaProdutoTela(primeiraTela, tis);
                prod.produtosTelaGUI();
            }
        });

        serviçosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VendaServicoTela serv = new VendaServicoTela(primeiraTela, tis);
                serv.servicosTelaGUI();
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAdminTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }

}
