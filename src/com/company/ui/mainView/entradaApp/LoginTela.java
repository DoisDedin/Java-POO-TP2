package com.company.ui.mainView.entradaApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTela {
    private JTextField editTextLogin;
    private JTextField editTextSenha;
    private JButton btnEntrar;
    private JLabel txtLoguin;
    private JLabel txtSenha;
    private JButton btnVoltar;
    private JPanel loginPanel;


    public LoginTela() {
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void mostraLoguin() {
        JFrame frame = new JFrame("Loguin");
        frame.setContentPane(new LoginTela().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
