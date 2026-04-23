package com.example;

public class EstrategiaBuffDaño implements EstrategiaDeModificador{

    @Override
    public double calcularModificacion(double daño) {
        return daño*2;
    }

    
}
