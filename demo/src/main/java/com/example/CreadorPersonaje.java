package com.example;

public abstract class CreadorPersonaje {
    public Personaje crearPersonaje() {
        Personaje personaje = new Personaje();
        setTipo(personaje);
        crearVida(personaje);
        crearAtaques(personaje);
        crearDefensa(personaje);
        return personaje;
    }
    protected abstract void setTipo(Personaje personaje);
    protected abstract void crearVida(Personaje personaje);
    protected abstract void crearAtaques(Personaje personaje);
    protected abstract void crearDefensa(Personaje personaje);
}
