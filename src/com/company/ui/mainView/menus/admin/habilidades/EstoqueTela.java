package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstoqueTela {

    private JPanel estoquePanel;
    private JButton adicionarProdutosButton;
    private JButton voltarButton;
    private JComboBox comboBox1;
    private JTextField nomeProd;
    private JTextField precoProd;
    private JTextField qtdProd;
    private JLabel nomeDoProdutoLabel;
    private JLabel preçoUnitárioLabel;
    private JLabel quantidadeLabel;
    private JLabel tipoDeProdutoLabel;

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    public JFrame frame;


    public EstoqueTela(PrimeiraTela prim , MenuAdminTela menuAdmin){
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }


    public void mostraEstoqueTelaGUI(){
        frame = new JFrame("Estoque");
        frame.setContentPane(estoquePanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAdminTela.frame.setVisible(true);
                frame.setVisible(false);

            }
        });

        adicionarProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeProd.getText();
                String preco = precoProd.getText();
                String quantidade = qtdProd.getText();
                int i = Integer.parseInt(quantidade);
                double z = Double.parseDouble(preco);

                primeiraTela.data.addProdEstoque(nome, i, z);
                JOptionPane.showMessageDialog(null, "Produto cadastrado", "Cadastro", JOptionPane.PLAIN_MESSAGE);
                limpaTela();
            }
        });
    }

    private void limpaTela() {
        nomeProd.setText("");
        precoProd.setText("");
        qtdProd.setText("");
    }
}
