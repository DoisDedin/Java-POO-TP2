package com.company.ui.mainView.menus.veterinario;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMostraCliente {
    private JPanel TelaMC;
    private JTextField textField1;
    private JButton buscarButton;
    private JButton voltarButton;

    public JFrame frame;

    private PrimeiraTela primeiraTela;
    private MenuVeterinarioTela menuVeterinarioTela;

    public TelaMostraCliente(PrimeiraTela prim, MenuVeterinarioTela menuVet){
        primeiraTela = prim;
        menuVeterinarioTela = menuVet;
    }

    public void TelaMostraClientesGUI() {
        frame = new JFrame("Mostrar Clientes");
        frame.setContentPane(TelaMC);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListener(this);
    }

    public void setUpListener(TelaMostraCliente tis){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuVeterinarioTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
