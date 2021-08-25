package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.admin.MenuAdminTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagarTela {
    private JButton voltarButton;
    private JLabel luzV;
    private JLabel luzP;
    private JLabel luzValor;
    private JLabel LuzDesc;
    private JLabel fornecedoresV;
    private JLabel fornecedoresP;
    private JLabel fornecedoresValor;
    private JLabel FornecedoresDesc;
    private JLabel internetV;
    private JLabel internetP;
    private JLabel internetValor;
    private JLabel internetDesc;
    private JLabel aguaV;
    private JLabel aguaP;
    private JLabel aguaValor;
    private JLabel aguaDescricao;
    private JPanel pagarPanel;

    private PrimeiraTela primeiraTela;
    private MenuAdminTela menuAdminTela;

    public JFrame frame;

    public PagarTela(PrimeiraTela prim , MenuAdminTela menuAdmin){
        primeiraTela = prim;
        menuAdminTela = menuAdmin;
    }

    public void pagarTelaGUI(){
        frame = new JFrame("Contas");
        frame.setContentPane(pagarPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    private void setUpListener(){

        luzV.setText(primeiraTela.data.getContas().get(0).getDataVencimento());
        luzP.setText(primeiraTela.data.getContas().get(0).getDataPagamento());
        luzValor.setText("R$ 580.20");
        LuzDesc.setText(primeiraTela.data.getContas().get(0).getDescricao());

        fornecedoresV.setText(primeiraTela.data.getContas().get(1).getDataVencimento());
        fornecedoresP.setText(primeiraTela.data.getContas().get(1).getDataPagamento());
        fornecedoresValor.setText("R$ 5200.70");
        FornecedoresDesc.setText(primeiraTela.data.getContas().get(1).getDescricao());

        internetV.setText(primeiraTela.data.getContas().get(2).getDataVencimento());
        internetP.setText(primeiraTela.data.getContas().get(2).getDataPagamento());
        internetValor.setText("R$ 230.99");
        internetDesc.setText(primeiraTela.data.getContas().get(2).getDescricao());

        aguaV.setText(primeiraTela.data.getContas().get(3).getDataVencimento());
        aguaP.setText(primeiraTela.data.getContas().get(3).getDataPagamento());
        aguaValor.setText("R$ 350.60");
        aguaDescricao.setText(primeiraTela.data.getContas().get(3).getDescricao());

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAdminTela.frame.setVisible(true);
                frame.setVisible(false);

            }
        });
    }
}
