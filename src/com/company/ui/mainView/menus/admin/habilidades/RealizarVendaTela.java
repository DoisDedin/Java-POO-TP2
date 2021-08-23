package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;

public class RealizarVendaTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    private JFrame frame;
    private JPanel vendasPanel;

    public RealizarVendaTela(PrimeiraTela prim, MenuAdminTela menuAdmin) {
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void realizaVendasTelaGUI(){
        frame = new JFrame("Vendas");
        frame.setContentPane(vendasPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

    }
}
