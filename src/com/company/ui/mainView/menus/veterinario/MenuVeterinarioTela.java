package com.company.ui.mainView.menus.veterinario;

import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.vendedor.TelaCadastrarCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVeterinarioTela {
    private JButton btnMostraCliente;
    private JPanel panelMenuVeterinario;
    private JButton btnTratamento;
    private JButton btnOrdemServico;
    private JButton btnVoltar;

    JFrame frame;
    private PrimeiraTela primeiraTela;
    private TelaMostraCliente mostraCliente;
    private TelaInfo info;
    private TelaOrdens ordens;

    public MenuVeterinarioTela(PrimeiraTela prim) {
        primeiraTela = prim;
    }

    public void mostraMenuVeterinarioGUI() {

        frame = new JFrame("Menu - Admin");
        frame.setContentPane(panelMenuVeterinario);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        mostraCliente = new TelaMostraCliente(primeiraTela, this);
        info = new TelaInfo(primeiraTela, this);
        ordens = new TelaOrdens(primeiraTela, this);

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

        btnMostraCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostraCliente.TelaMostraClientesGUI();
                frame.setVisible(false);
            }
        });

        btnOrdemServico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordens.TelaOrdensGUI();
                frame.setVisible(false);
            }
        });

        btnTratamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info.TelaInfoGUI();
                frame.setVisible(false);
            }
        });
    }
}
