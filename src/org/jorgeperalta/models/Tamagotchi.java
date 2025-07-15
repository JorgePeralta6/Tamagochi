package org.jorgeperalta.models;

public class Tamagotchi {
    private int inteligencia = 0;
    private int hambre = 0;
    private int diversion = 0;
    private int vida = 100;
    private String genero;
    
    

    public Tamagotchi(){

    }

    public Tamagotchi(int inteligencia, int hambre, int diversion, int vida, String genero){
        this.inteligencia = inteligencia;
        this.hambre = hambre;
        this.diversion = diversion;
        this.vida = vida;
        this.genero = genero;

    }

    public int getInteligencia(){
        return inteligencia;
    }
    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }
    public int getHambre(){
        return hambre;
    }
    public void setHambre(int hambre){
        this.hambre = hambre;
    }
    public int getDiversion(){
        return diversion;
    }
    public void setDiversion(int diversion){
        this.diversion = diversion;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}