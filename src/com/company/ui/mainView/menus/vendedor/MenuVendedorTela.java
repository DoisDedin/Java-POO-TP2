package com.company.ui.mainView.menus.vendedor;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVendedorTela {
    private JPanel menuVeterinarioPanel;
    private JButton btnCadastroCliente;
    private JButton btnVendas;
    private JButton btnVoltar;

    JFrame frame;
    private PrimeiraTela primeiraTela;
    private TelaCadastrarCliente telaCadastrarCliente;
    private TelaVendas vendas;
    public MenuVendedorTela(PrimeiraTela prim) {
        primeiraTela = prim;
    }

    public void mostraMenuVendedorGUI() {

        frame = new JFrame("Menu - Admin");
        frame.setContentPane(menuVeterinarioPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        telaCadastrarCliente = new TelaCadastrarCliente(primeiraTela, this);
        vendas = new TelaVendas(primeiraTela, this);
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

        btnCadastroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaCadastrarCliente.CadastraClienteGUI();
                frame.setVisible(false);
            }
        });

        btnVendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendas.TelaVendasGUI();
                frame.setVisible(false);
            }
        });
    }
}
