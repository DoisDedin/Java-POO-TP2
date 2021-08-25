package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarClienteTela {
    private JTextField nometest;
    private JTextField cpftext;
    private JTextField teltext;
    private JTextField qtdtext;
    private JButton confirmarButton;
    private JButton cancelarButton;
    private JLabel nomeLabel;
    private JLabel CPFLabel;
    private JLabel telefoneLabel;
    private JLabel quantidaddeDeComprasLabel;
    private JPanel cadCLiente;

    private JFrame frame;

    private PrimeiraTela primeiraTela;
    private MostraClienteTela mostraCliente;

    public CadastrarClienteTela(PrimeiraTela prim, MostraClienteTela mostra){
        primeiraTela = prim;
        mostraCliente = mostra;
    }

    public void addClienteAdminGUI(){
        frame = new JFrame("Clientes");
        frame.setContentPane(cadCLiente);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    public void setUpListener(){
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpaTela();
                mostraCliente.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nometest.getText();
                String cpf = cpftext.getText();
                String telefone = teltext.getText();
                String qtdCompras = qtdtext.getText();

                try {
                    if (!nome.isEmpty() && !cpf.isEmpty() && !telefone.isEmpty() && !qtdCompras.isEmpty()) {
                        primeiraTela.data.newCliente(nome, cpf, telefone, Integer.parseInt(qtdCompras));
                        frame.setVisible(false);
                        mostraCliente.frame.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Cadastro Invalido , tente novamente!!");
                        limpaTela();
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Cadastro Invalido , tente novamente!!");
                    limpaTela();
                }
            }
        });
    }

    private void limpaTela() {
        nometest.setText("");
        cpftext.setText("");
        teltext.setText("");
        qtdtext.setText("");
    }
}
