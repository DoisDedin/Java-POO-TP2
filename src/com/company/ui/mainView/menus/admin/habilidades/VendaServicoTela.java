package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.vendedor.TelaVendas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class VendaServicoTela {
    private JComboBox selecServ;
    private JTextField qtdAnimais;
    private JButton confirmarButton;
    private JButton voltarButton;
    private JPanel TelaQuantidade;

    private PrimeiraTela primeiraTela;
    private RealizarVendaTela menuVend;

    public JFrame frame;

    public VendaServicoTela(PrimeiraTela prim, RealizarVendaTela vend) {
        primeiraTela = prim;
        menuVend = vend;
    }

    public void servicosTelaGUI(){
        frame = new JFrame("Serviços");
        frame.setContentPane(TelaQuantidade);
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
                if (Objects.equals(selecServ.getSelectedItem(), "...")){
                    JOptionPane.showMessageDialog(null, "Opção Invalida", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    int qtd = Integer.parseInt(qtdAnimais.getText());
                    JOptionPane.showMessageDialog(null, "Valor final: R$ " + " " + primeiraTela.data.retonaPrecoServ((String) selecServ.getSelectedItem(), qtd), "Valor", JOptionPane.PLAIN_MESSAGE);
                    primeiraTela.data.vendeServicos((String) Objects.requireNonNull(selecServ.getSelectedItem()), qtd);
                }
            }
        });
    }
}
