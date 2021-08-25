package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.vendedor.TelaVendas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class VendaProdutoTela {
    private JComboBox selecProduto;
    private JTextField qtdProd;
    private JButton confirmarButton;
    private JButton voltarButton;
    private JPanel TelaProdutos;

    private PrimeiraTela primeiraTela;
    private RealizarVendaTela menuVend;

    private JFrame frame;

    public VendaProdutoTela(PrimeiraTela prim, RealizarVendaTela vend) {
        primeiraTela = prim;
        menuVend = vend;
    }

    public void produtosTelaGUI(){
        frame = new JFrame("Produtos");
        frame.setContentPane(TelaProdutos);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuVend.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(selecProduto.getSelectedItem(), "...")){
                    JOptionPane.showMessageDialog(null, "Opção Invalida", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    int qtd = Integer.parseInt(qtdProd.getText());
                    JOptionPane.showMessageDialog(null, "Valor final: R$ " + " " + primeiraTela.data.retornaPrecoTotal((String) selecProduto.getSelectedItem(), qtd), "Valor", JOptionPane.PLAIN_MESSAGE);
                    primeiraTela.data.vendeProduto((String) selecProduto.getSelectedItem(), qtd);
                }
            }
        });
    }
}
