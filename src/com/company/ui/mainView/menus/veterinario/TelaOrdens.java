package com.company.ui.mainView.menus.veterinario;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaOrdens {
    private JPanel telaOrdensPanel;
    private JTextField textField1;
    private JButton voltarButton;

    public JFrame frame;

    private PrimeiraTela primeiraTela;
    private MenuVeterinarioTela menuVeterinarioTela;

    public TelaOrdens(PrimeiraTela prim, MenuVeterinarioTela menuVet){
        primeiraTela = prim;
        menuVeterinarioTela = menuVet;
    }

    public void TelaOrdensGUI() {
        frame = new JFrame("Ordens de serviço");
        frame.setContentPane(telaOrdensPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListener(this);
    }

    public void setUpListener(TelaOrdens tis){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuVeterinarioTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
