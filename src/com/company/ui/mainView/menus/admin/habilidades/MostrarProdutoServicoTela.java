package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;

public class MostrarProdutoServicoTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;
    private JPanel prod_servPanel;

    private JFrame frame;

    public MostrarProdutoServicoTela(PrimeiraTela prim, MenuAdminTela menuAdmin){
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void mostraProdutoServicoTelaGUI(){
        frame = new JFrame("Produtos/Serviços");
        frame.setContentPane(prod_servPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

    }
}
