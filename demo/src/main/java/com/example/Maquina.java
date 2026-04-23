package com.example;

public class Maquina {
    private int puntajeTotal;
    private Personaje personaje;

    public Maquina(int puntajeTotal, Personaje personaje) {
        this.puntajeTotal = puntajeTotal;
        this.personaje = personaje;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

}
