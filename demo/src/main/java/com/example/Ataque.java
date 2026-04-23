package com.example;

public class Ataque {
    public String nombre;
    public double daño;
    public int cantidad;
    public EstrategiaDeAtaque estrategia;
    
    public Ataque(String nombre, double daño, int cantidad, EstrategiaDeAtaque estrategia) {
        this.nombre = nombre;
        this.daño = daño;
        this.cantidad = cantidad;
        this.estrategia = estrategia;
    }
    
    
}
