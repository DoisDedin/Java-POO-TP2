package com.company.ui.mainView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoguinView {
    private JPanel loguinPanel;
    private JButton btnAdmin;
    private JButton btnVeterinario;
    private JButton btnVendedor;

    public LoguinView() {
        btnVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "rolou!!");
            }
        });

    }

    public void mostraLoguin() {
        JFrame frame = new JFrame("Loguin");
        frame.setContentPane(new LoguinView().loguinPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
