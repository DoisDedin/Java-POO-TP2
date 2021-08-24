package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostraFuncionarioTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    private JPanel funcionariosPanel;
    private JButton cadastrarFuncionarioButton;
    private JButton mostrarFuncionariosButton;
    private JButton voltarButton;

    public JFrame frame;

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

        setUpListener(this);
    }

    private void setUpListener(MostraFuncionarioTela tis){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAdminTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        cadastrarFuncionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdicionarFuncionarioTela func = new AdicionarFuncionarioTela(primeiraTela, tis);
                func.addFuncTelaGUI();
            }
        });

        mostrarFuncionariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
