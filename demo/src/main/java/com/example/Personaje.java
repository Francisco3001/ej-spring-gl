package com.example;

import java.util.List;

import com.example.Config.TipoPersonaje;

public abstract class Personaje {
    private TipoPersonaje tipo;
    private int vida;
    private List<Ataque> ataques;
    private int defensa;
    private List<Modificador> modificadores;

    public Personaje(TipoPersonaje tipo, int vida, List<Ataque> ataques, int defensa, List<Modificador> modificadores) {
        this.tipo = tipo;
        this.vida = vida;
        this.ataques = ataques;
        this.defensa = defensa;
        this.modificadores = modificadores;
    }

    public TipoPersonaje getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersonaje tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public List<Modificador> getModificadores() {
        return modificadores;
    }

    public void setModificadores(List<Modificador> modificadores) {
        this.modificadores = modificadores;
    }

}
