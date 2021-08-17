package com.company.ui.mainView.entradaApp;

import javax.naming.Context;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTela {
    private JTextField editTextLogin;
    private JButton btnEntrar;
    private JLabel txtLoguin;
    private JLabel txtSenha;
    private JButton btnVoltar;
    private JPanel loginPanel;
    private JPasswordField editTextSenha;

    private String mUser  = "null";

    private PrimeiraTela primeiraTela ;

    public String getmUser() {
        return this.mUser;
    }

    public void setmUser(String user) {
        this.mUser = user;
    }

    public LoginTela(PrimeiraTela prim) {
        primeiraTela = prim;
    }

    public void mostraLoginGUI(String title,String user) {
        JFrame frame = new JFrame(title);
        frame.setContentPane(loginPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        setmUser(user);
        setUpListener(frame);
    }

    public void setUpListener(JFrame frame){
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                primeiraTela.frame.setVisible(true);
            }
        });

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               efetuaLogin(  txtLoguin.getText() , txtSenha.getText());
            }
        });
    }


    public void  efetuaLogin( String login, String senha){
        switch (getmUser()){
            case "a" ->{
                JOptionPane.showMessageDialog(null, "rolousdasdasda");

            }
            case "b" ->{

            }
            case "c" ->{

            }
            default -> {

            }
        }
    }





}
