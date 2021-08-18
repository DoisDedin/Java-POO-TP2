package com.company.ui.mainView.menus.veterinario;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVeterinarioTela {
    private JButton btnMostraClienre;
    private JPanel panelMenuVeterinario;
    private JButton btnTratamento;
    private JButton btnOrdemServico;
    private JButton btnVoltar;

    JFrame frame;
    private PrimeiraTela primeiraTela;

    public MenuVeterinarioTela() {

    }

    public void mostraMenuVeterinarioGUI(PrimeiraTela primeiraTela) {
        this.primeiraTela = primeiraTela;

        frame = new JFrame("Menu - Admin");
        frame.setContentPane(panelMenuVeterinario);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListeners();
    }

    private void setUpListeners() {
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiraTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
