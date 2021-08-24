package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;

public class EstoqueTela {

    private JPanel estoquePanel;
    private JButton adicionarProdutosButton;
    private JButton voltarButton;

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    private JFrame frame;


    public EstoqueTela(PrimeiraTela prim , MenuAdminTela menuAdmin){
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }


    public void mostraEstoqueTelaGUI(){
        frame = new JFrame("Estoque");
        frame.setContentPane(estoquePanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

    }
}
