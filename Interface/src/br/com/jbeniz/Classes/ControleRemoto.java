package br.com.jbeniz.Classes;

import br.com.jbeniz.Interface.Controlador;

public class ControleRemoto implements Controlador {

    private Boolean ligado;
    private Boolean tocando;
    private Integer volume;
    public ControleRemoto (){
        setLigado(false);
        setVolume(50);
        setTocando(true);
    }

    public Boolean getLigado() {
        return ligado;
    }

    public Boolean setLigado(Boolean ligado) {
        this.ligado = ligado;
        return ligado;
    }

    public Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        this.setTocando(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("*** Abrindo menu ***");
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.println("Volume: " + getVolume());
        for(int i = 0; i <= getVolume(); i+=5){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu...");

    }

    @Override
    public void maisVolume() {
        if(getLigado() == true){
            setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado() == true){
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() == true){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() == true){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if((getLigado() == true) && (getTocando() == false)){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if((getLigado() == true) && (getTocando() == true)){
            setTocando(false);
        }
    }

}
