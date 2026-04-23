package com.example;

import java.util.List;

public class CreadorMago extends CreadorPersonaje {
    @Override
    protected void crearVida(Personaje personaje) {
        personaje.setVida(120);
    }

    @Override
    protected void crearAtaques(Personaje personaje) {
        Ataque bolaDeFuego = new Ataque("Bola de Fuego", 25, 5, new EstrategiaSimple());
        Ataque rayo = new Ataque("Rayo", 35, 10, new EstrategiaAleatoria());
        personaje.setAtaques(List.of(bolaDeFuego, rayo));
    }

    @Override
    protected void crearDefensa(Personaje personaje) {
        personaje.setDefensa(50);
    }

    @Override
    protected void setTipo(Personaje personaje) {
        personaje.setTipo(TipoPersonaje.MAGO);
    }

}
