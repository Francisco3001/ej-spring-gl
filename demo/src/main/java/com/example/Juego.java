package com.example;

public class Juego {
    private Arbitro arbitro;
    private Personaje personaje;
    private Maquina maquina;
    private Jugador jugador;
    private boolean ganador;

    public Juego(Arbitro arbitro, Personaje personaje, Maquina maquina, Jugador jugador, boolean ganador) {
        this.arbitro = arbitro;
        this.personaje = personaje;
        this.maquina = maquina;
        this.jugador = jugador;
        this.ganador = ganador;
    }

}