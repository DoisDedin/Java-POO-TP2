package com.company.ui.mainView.entradaApp;

import com.company.components_models.estabelecimento.pessoas.funcionarios.admin.Admin;
import com.company.ui.mainView.menus.admin.MenuAdminTela;
import com.company.ui.mainView.menus.vendedor.MenuVendedorTela;
import com.company.ui.mainView.menus.veterinario.MenuVeterinarioTela;

import javax.naming.Context;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginTela {
    private JTextField editTextLogin;
    private JButton btnEntrar;
    private JLabel txtLoguin;
    private JLabel txtSenha;
    private JButton btnVoltar;
    private JPanel loginPanel;
    private JPasswordField editTextSenha;

    private String mUser = "null";

    JFrame frame;

    private final PrimeiraTela primeiraTela;

    private final MenuAdminTela menuAdminTela = new MenuAdminTela();
    private final MenuVendedorTela menuVendedorTela = new MenuVendedorTela();
    private final MenuVeterinarioTela menuVeterinarioTela = new MenuVeterinarioTela();


    public String getmUser() {
        return this.mUser;
    }

    public void setmUser(String user) {
        this.mUser = user;
    }

    public LoginTela(PrimeiraTela prim) {
        primeiraTela = prim;
    }

    public void mostraLoginGUI(String title, String user) {
        frame = new JFrame(title);
        frame.setContentPane(loginPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        setmUser(user);
        setUpListener(frame);
    }

    public void setUpListener(JFrame frame) {
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
                efetuaLogin(editTextLogin.getText(), editTextSenha.getText());
            }
        });
    }


    public void efetuaLogin(String login, String senha) {
        switch (getmUser()) {
            case "a" -> {
                Admin admin = primeiraTela.data.getAdmin();

                if (Objects.equals(admin.getUser(), login) && Objects.equals(admin.getSenha(), senha)) {
                    JOptionPane.showMessageDialog(null, "rolousdasdasda");
                    menuAdminTela.mostraMenuAdminGUI(primeiraTela);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ou senha errados,\n Tente novamente!!");
                }
                editTextLogin.setText("");
                editTextSenha.setText("");
            }
            case "b" -> {
                if (primeiraTela.data.existeVendedor(login, senha)) {
                    JOptionPane.showMessageDialog(null, "LOGOU VENDEDOR!!");
                    menuVendedorTela.mostraMenuVendedorGUI(primeiraTela);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ou senha errados,\n Tente novamente!!");
                }
                editTextLogin.setText("");
                editTextSenha.setText("");
            }
            case "c" -> {
                if (primeiraTela.data.existeVeterinario(login, senha)) {
                    JOptionPane.showMessageDialog(null, "LOGOU VETERINARIO!!");
                    menuVeterinarioTela.mostraMenuVeterinarioGUI(primeiraTela);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ou senha errados,\n Tente novamente!!");
                }
                editTextLogin.setText("");
                editTextSenha.setText("");
            }
            default -> {
                JOptionPane.showMessageDialog(null, "INVALID!!");
                System.exit(0);
            }
        }
    }


}
