package com.example;

import java.util.List;

public class CreadorOrco extends CreadorPersonaje {
    @Override
    protected void crearVida(Personaje personaje) {
        personaje.setVida(110);
    }

    @Override
    protected void crearAtaques(Personaje personaje) {
    Ataque garra = new Ataque("Garra", 15, 5, new EstrategiaSimple());
    Ataque embestida = new Ataque("Embestida", 25, 10, new EstrategiaAleatoria());
    personaje.setAtaques(List.of(garra, embestida));}

    @Override
    protected void crearDefensa(Personaje personaje) {
        personaje.setDefensa(30);
    }
    
    @Override
    protected void setTipo(Personaje personaje) {
        personaje.setTipo(TipoPersonaje.ORCO);
    }
}
