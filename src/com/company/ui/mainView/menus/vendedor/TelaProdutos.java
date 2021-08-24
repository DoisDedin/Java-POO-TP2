package com.company.ui.mainView.menus.vendedor;

import com.company.components_models.estabelecimento.produto_servico.Produto;
import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TelaProdutos {
    private JPanel TelaProdutos;
    private JTextField qtdProd;
    private JButton confirmarButton;
    private JLabel produtoLabel;
    private JLabel quantidadeLabel;
    private JLabel PRODUTOSLabel;
    private JComboBox selecProduto;
    private JButton voltarButton;

    private PrimeiraTela primeiraTela;
    private TelaVendas menuVend;

    private JFrame frame;

    public TelaProdutos(PrimeiraTela prim, TelaVendas vend) {
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
                    primeiraTela.data.vendeProduto((String) selecProduto.getSelectedItem(), qtd);
                }
            }
        });
    }
}
