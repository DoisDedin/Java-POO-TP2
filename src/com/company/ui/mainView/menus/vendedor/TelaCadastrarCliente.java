package com.company.ui.mainView.menus.vendedor;

import com.company.components_models.estabelecimento.data.Data;
import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastrarCliente extends javax.swing.JFrame {
    private JTextField editTextNomeCliente;
    private JTextField editTextCpfCliente;
    private JTextField editTextTelCliente;
    private JTextField editTextQtdComprasCliente;
    private JPanel TelaCadastro;
    private JLabel nomeLabel;
    private JLabel CPFLabel;
    private JLabel telefoneLabel;
    private JLabel quantidadeDeComprasLabel;
    private JLabel CADASTRODECLIENTESLabel;
    private JButton confirmarButton;
    private JButton btnCancelar;

    private JFrame frame;

    private PrimeiraTela primeiraTela;
    private MenuVendedorTela menuVendedorTela;

    public TelaCadastrarCliente(PrimeiraTela prim, MenuVendedorTela menVend) {
        primeiraTela = prim;
        menuVendedorTela = menVend;
    }

    public void CadastraClienteGUI() {
        frame = new JFrame("Cadastro de clientes");
        frame.setContentPane(TelaCadastro);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListener(frame);
    }

    public void setUpListener(JFrame frame) {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = editTextNomeCliente.getText();
                String cpf = editTextCpfCliente.getText();
                String telefone = editTextTelCliente.getText();
                String qtdCompras = editTextQtdComprasCliente.getText();

                try {
                    if (!nome.isEmpty() && !cpf.isEmpty() && !telefone.isEmpty() && !qtdCompras.isEmpty()) {
                        primeiraTela.data.newCliente(nome, cpf, telefone, Integer.parseInt(qtdCompras));
                        frame.setVisible(false);
                        menuVendedorTela.frame.setVisible(true);

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


        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpaTela();
                frame.setVisible(false);
                menuVendedorTela.frame.setVisible(true);
            }
        });
    }

    private void limpaTela() {
        editTextNomeCliente.setText("");
        editTextTelCliente.setText("");
        editTextCpfCliente.setText("");
        editTextQtdComprasCliente.setText("");
    }

}
