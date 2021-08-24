package com.company.ui.mainView.menus.admin.habilidades;

import com.company.ui.mainView.entradaApp.PrimeiraTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarFuncionarioTela {
    private JTextField nomeText;
    private JTextField cargoText;
    private JTextField salarioText;
    private JTextField usuarioText;
    private JTextField senhaText;
    private JButton cadastrarButton;
    private JButton cancelarButton;
    private JTextField cpfText;
    private JTextField telText;
    private JLabel nomeLabel;
    private JLabel CPFLabel;
    private JLabel telefoneLabel;
    private JLabel cargoLabel;
    private JLabel salarioLabel;
    private JLabel usuárioLabel;
    private JLabel senhaLabel;
    private JLabel cadastroLabel;
    private JPanel addFuncPanel;

    private JFrame frame;

    private PrimeiraTela primeiraTela;
    private MostraFuncionarioTela funcionarioTela;

    public AdicionarFuncionarioTela(PrimeiraTela prim, MostraFuncionarioTela funcTela){
        primeiraTela = prim;
        funcionarioTela = funcTela;
    }


    public void addFuncTelaGUI(){
        frame = new JFrame("Funcionarios");
        frame.setContentPane(addFuncPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        setUpListener();
    }

    public void setUpListener(){
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funcionarioTela.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeText.getText();
                String cpf = cpfText.getText();
                String tel = telText.getText();
                String cargo = cargoText.getText();
                String salario = salarioText.getText();
                String user = usuarioText.getText();
                String senha = senhaText.getText();

                primeiraTela.data.newFuncionario(nome, cpf, tel, cargo, Double.parseDouble(salario), user, senha);
                JOptionPane.showMessageDialog(null, "Funcionario cadastrado!!");
                limpaTela();
            }
        });
    }

    private void limpaTela(){
        nomeText.setText("");
        cpfText.setText("");
        telText.setText("");
        cargoText.setText("");
        salarioText.setText("");
        usuarioText.setText("");
        senhaText.setText("");
    }
}
