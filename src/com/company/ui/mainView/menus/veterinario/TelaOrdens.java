package com.company.ui.mainView.menus.veterinario;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class TelaOrdens {
    private JPanel telaOrdensPanel;
    private JButton voltarButton;
    private JLabel qtdAnimaisTXT;
    private JLabel consultaslTXT;
    private JLabel qtdFix;
    private JLabel consultaFIX;
    private JLabel precoFIX;
    private JLabel preçoTotalTXT;

    public JFrame frame;

    private PrimeiraTela primeiraTela;
    private MenuVeterinarioTela menuVeterinarioTela;

    public TelaOrdens(PrimeiraTela prim, MenuVeterinarioTela menuVet){
        primeiraTela = prim;
        menuVeterinarioTela = menuVet;
    }

    public void TelaOrdensGUI() {
        frame = new JFrame("Ordens de serviço");
        frame.setContentPane(telaOrdensPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setUpListener(this);
    }

    public void setUpListener(TelaOrdens tis){
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuVeterinarioTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        double preco = primeiraTela.data.retornaPrecoConsulta();
        int qtd = primeiraTela.data.retornaQuantidadeConsulta();

        preco = preco * qtd;

        qtdFix.setText(String.valueOf(qtd));

        precoFIX.setText("R$ " + preco);

        java.util.Date d = new Date();
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

        consultaFIX.setText(dStr);
    }
}
