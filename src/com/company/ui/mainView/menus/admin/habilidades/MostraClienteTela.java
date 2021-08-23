package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;

public class MostraClienteTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;
    private JPanel MostraClientePanel;

    private JFrame frame;

    public MostraClienteTela(PrimeiraTela prim , MenuAdminTela menuAdmin){
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void mostraClienteGUI(){
        frame = new JFrame("Clientes");
        frame.setContentPane(MostraClientePanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

    }
}
