package com.company.ui.mainView.entradaApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela {
    private JPanel primeiraPanel;
    private JButton btnAdmin;
    private JButton btnVeterinario;
    private JButton btnVendedor;


    LoginTela loginTela = new LoginTela();

    public PrimeiraTela() {

        setUpListeners();


    }

    public void mostraPrimeiraTelaGUI() {
        JFrame frame = new JFrame("Menu Principal");
        frame.setContentPane(new PrimeiraTela().primeiraPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


    public void setUpListeners() {
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Admin", "a");
            }
        });
        btnVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Vendedor",  "b");
            }
        });

        btnVeterinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Veterinario", "c");
            }
        });


    }
}
