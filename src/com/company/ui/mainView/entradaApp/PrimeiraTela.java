package com.company.ui.mainView.entradaApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela {
    private JPanel primeiraPanel;
    private JButton btnAdmin;
    private JButton btnVeterinario;
    private JButton btnVendedor;

    public LoginTela loginTela = new LoginTela(this);

    public JFrame frame;

    public PrimeiraTela() {

    }

    public void mostraPrimeiraTelaGUI() {
        frame = new JFrame("Menu Principal");
        frame.setContentPane(primeiraPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListeners(frame);

    }


    public void setUpListeners(JFrame frame) {
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Admin", "a");
                frame.setVisible(false);
            }
        });
        btnVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Vendedor", "a");
                frame.setVisible(false);
            }
        });

        btnVeterinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Veterinario", "a");
                frame.setVisible(false);
            }
        });


    }
}
