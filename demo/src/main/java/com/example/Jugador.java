package com.example;

public class Jugador {
    private int puntajeTotal;
    private Personaje personaje;

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Jugador(int puntajeTotal, Personaje personaje) {
        this.puntajeTotal = puntajeTotal;
        this.personaje = personaje;
    }

}
