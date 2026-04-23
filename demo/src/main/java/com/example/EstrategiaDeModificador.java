package com.example;

public interface EstrategiaDeModificador {
    TipoModificador getTipo();
    double calcularModificacion(double danioActual);
}
