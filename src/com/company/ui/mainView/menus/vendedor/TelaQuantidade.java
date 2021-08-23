package com.company.ui.mainView.menus.vendedor;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaQuantidade {
    private JTextField qtdAnimais;
    private JPanel TelaQuantidade;
    private JButton confirmarButton;
    private JLabel quantidadeLabel;
    private JLabel QUANTIDADEDEANIMAISLabel;
    private JComboBox comboBox1;
    private JLabel serviçoLabel;
    private JButton voltarButton;

    private PrimeiraTela primeiraTela;
    private TelaVendas menuVend;

    public JFrame frame;

    public TelaQuantidade(PrimeiraTela prim, TelaVendas vend) {
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
    }
}
