package com.company.ui.mainView.entradaApp;

import javax.swing.*;

public class LoguinTela {
    private JTextField editTextLogin;
    private JTextField editTextSenha;
    private JButton btnEntrar;
    private JLabel txtLoguin;
    private JLabel txtSenha;
    private JButton btnVoltar;
    private JPanel loginPanel;


    public void mostraLoguin() {
        JFrame frame = new JFrame("Loguin");
        frame.setContentPane(new LoguinTela().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
