package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;

public class MostrarContasTela {


    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;
    private JPanel contasPanel;
    private JButton pagarContaButton;
    private JButton visualizarContasButton;
    private JButton voltarButton;

    private JFrame frame;

    public MostrarContasTela(PrimeiraTela prim, MenuAdminTela menuAdmin) {
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void mostraContasTelaGUI(){
        frame = new JFrame("Contas");
        frame.setContentPane(contasPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

    }
}
