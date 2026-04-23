package com.example;

public class CreadorMago extends CreadorPersonaje {
    @Override
    protected void crearVida(Personaje personaje) {
        personaje.setVida(120);
    }

    @Override
    protected void crearAtaques(Personaje personaje) {
       //TODO personaje.setAtaques(new List<Ataque>.add("Bola de fuego").add("Rayo de hielo"));
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
