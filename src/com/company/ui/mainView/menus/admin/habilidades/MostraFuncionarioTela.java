package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;

public class MostraFuncionarioTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;
    private JPanel funcionariosPanel;
    private JButton cadastrarFuncionarioButton;
    private JButton mostrarFuncionariosButton;
    private JButton voltarButton;

    private JFrame frame;

    public MostraFuncionarioTela(PrimeiraTela prim, MenuAdminTela menuAdmin) {
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void mostraFuncionariosTelaGUI(){
        frame = new JFrame("Funcionarios");
        frame.setContentPane(funcionariosPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

    }
}
