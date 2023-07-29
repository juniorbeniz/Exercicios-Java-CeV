package br.com.jbeniz;

import br.com.jbeniz.Classes.ControleRemoto;

public class App {
    public static void main(String[] args) {
        
        ControleRemoto c1 = new ControleRemoto();

        c1.desligar();
        c1.ligar();
        c1.maisVolume();
        c1.maisVolume();
        c1.abrirMenu();
        c1.fecharMenu();
    }
}