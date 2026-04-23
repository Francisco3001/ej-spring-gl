package com.example;

import java.util.List;

public class Personaje {
    private TipoPersonaje tipo;
    private Integer vida;
    private List<Ataque> ataques;
    private Integer defensa;
    private List<Modificador> modificadores;

    public Personaje() {
    }
    public TipoPersonaje getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoPersonaje tipo) {
        this.tipo = tipo;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public void addAtaque(Ataque ataque) {
        this.ataques.add(ataque);
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public List<Modificador> getModificadores() {
        return modificadores;
    }

    public void addModificador(Modificador modificador) {
        this.modificadores.add(modificador);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "tipo=" + tipo +
                ", vida=" + vida +
                ", ataques=" + ataques +
                ", defensa=" + defensa +
                ", modificadores=" + modificadores +
                '}';
    }
}
