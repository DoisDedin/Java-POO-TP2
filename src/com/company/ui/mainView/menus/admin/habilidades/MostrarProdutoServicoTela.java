package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class MostrarProdutoServicoTela {

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;
    private JPanel prod_servPanel;
    private JButton voltarButton;
    private JLabel dia;
    private JLabel vendidosProd;
    private JLabel valorProd;
    private JLabel vendidosServ;
    private JLabel valorServ;
    private JLabel lucro;

    private JFrame frame;

    public MostrarProdutoServicoTela(PrimeiraTela prim, MenuAdminTela menuAdmin){
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void mostraProdutoServicoTelaGUI(){
        frame = new JFrame("Produtos/Serviços");
        frame.setContentPane(prod_servPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){
        java.util.Date d = new Date();
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
        dia.setText(dStr);

        vendidosProd.setText(primeiraTela.data.retQtd());
        valorProd.setText(primeiraTela.data.retValor());

        vendidosServ.setText(primeiraTela.data.retQtdServ());
        valorServ.setText(primeiraTela.data.retValorServ());

        lucro.setText(primeiraTela.data.retLucro());

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAdminTela.frame.setVisible(true);
                frame.setVisible(false);

            }
        });
    }
}
