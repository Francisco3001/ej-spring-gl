package com.example;

public class CreadorOrco extends CreadorPersonaje {
    @Override
    protected void crearVida(Personaje personaje) {
        personaje.setVida(110);
    }

    @Override
    protected void crearAtaques(Personaje personaje) {
        //TODO personaje.setAtaques(new List<Ataque>.add("Golpe").add("Embiste"));
    }

    @Override
    protected void crearDefensa(Personaje personaje) {
        personaje.setDefensa(30);
    }
    
    @Override
    protected void setTipo(Personaje personaje) {
        personaje.setTipo(TipoPersonaje.ORCO);
    }
}
