package com.example;

import java.util.List;

public class CreadorGuerrero extends CreadorPersonaje {
    @Override
    protected void crearVida(Personaje personaje) {
        personaje.setVida(100);
    }

    @Override
    protected void crearAtaques(Personaje personaje) {
       Ataque golpe = new Ataque("Golpe", 20, 5, new EstrategiaSimple());
       Ataque embiste = new Ataque("Embiste", 30, 10, new EstrategiaAleatoria());
       personaje.setAtaques(List.of(golpe, embiste));
    }

    @Override
    protected void crearDefensa(Personaje personaje) {
        personaje.setDefensa(40);
    }

    @Override
    protected void setTipo(Personaje personaje) {
        personaje.setTipo(TipoPersonaje.GUERRERO);
    }
    
}
