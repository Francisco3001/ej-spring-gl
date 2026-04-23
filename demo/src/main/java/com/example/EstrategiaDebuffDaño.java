package com.example;

public class EstrategiaDebuffDaño implements EstrategiaDeModificador{

    @Override
    public double calcularModificacion(double daño) {
        return daño*0.5;
    }
    
}
