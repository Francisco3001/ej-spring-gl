package com.example;

public class EstrategiaSimple implements EstrategiaDeAtaque{

    @Override
    public int calcularDaño(int daño, TipoPersonaje tipoPersonaje) {
        return daño;
    }
    
}