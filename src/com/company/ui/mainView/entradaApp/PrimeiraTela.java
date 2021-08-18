package com.company.ui.mainView.entradaApp;

import com.company.components_models.estabelecimento.data.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela {
    private JPanel primeiraPanel;
    private JButton btnAdmin;
    private JButton btnVeterinario;
    private JButton btnVendedor;

    public LoginTela loginTela = new LoginTela(this);

    public Data data = new Data();
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
                loginTela.mostraLoginGUI("Login - Vendedor", "b");
                frame.setVisible(false);
            }
        });

        btnVeterinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTela.mostraLoginGUI("Login - Veterinario", "c");
                frame.setVisible(false);
            }
        });


    }
}
