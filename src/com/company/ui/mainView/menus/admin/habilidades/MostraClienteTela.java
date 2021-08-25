package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostraClienteTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    private JPanel MostraClientePanel;
    private JButton cadastrarButton;
    private JButton mostrarClientesButton;
    private JButton voltarButton;
    private JTextField clienteBusca;
    private JLabel nomeDoClienteParaLabel;

    public JFrame frame;

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

        setUpListener(this);
    }

    private void setUpListener(MostraClienteTela tis){
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastrarClienteTela cad = new CadastrarClienteTela(primeiraTela, tis);
                cad.addClienteAdminGUI();
            }
        });

        mostrarClientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = clienteBusca.getText();
                primeiraTela.data.buscaCliente(nome);
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
