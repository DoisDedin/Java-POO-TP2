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

    private String user ;
    public LoginTela() {
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void mostraLoginGUI(String title, String user) {
        this.user = user;
        JFrame frame = new JFrame(title);
        frame.setContentPane(new LoginTela().loginPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
