package com.company.ui.mainView.menus.veterinario;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInfo {
    private JTextField dadosConsulta;
    private JPanel panel1;
    private JButton confirmarButton;
    private JButton voltarButton;

    public JFrame frame;

    private PrimeiraTela primeiraTela;
    private MenuVeterinarioTela menuVeterinarioTela;

    public TelaInfo(PrimeiraTela prim, MenuVeterinarioTela menuVet){
        primeiraTela = prim;
        menuVeterinarioTela = menuVet;
    }

    public void TelaInfoGUI() {
        frame = new JFrame("Informações de tratamento");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListener(this);
    }

    public void setUpListener(TelaInfo tis){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuVeterinarioTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info = dadosConsulta.getText();
                primeiraTela.data.guardaInfoConsulta(info);
                dadosConsulta.setText("");
            }
        });
    }
}
