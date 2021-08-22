package com.company.ui.mainView;

import com.company.ui.mainView.entradaApp.LoginTela;
import com.company.ui.mainView.entradaApp.PrimeiraTela;
import com.company.ui.mainView.menus.vendedor.TelaCadastrarCliesnte;


//INICIALIZA PROGRAMA
public class PetShop {
    public static void main(String[] args) {
        //PrimeiraTela primeiraTelaView = new PrimeiraTela();
        //primeiraTelaView.mostraPrimeiraTelaGUI();
        TelaCadastrarCliesnte tela = new TelaCadastrarCliesnte();
        tela.CadastraClienteGUI();
    }
}
