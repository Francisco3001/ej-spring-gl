package com.example;

public class EstrategiaBuffDaño implements EstrategiaDeModificador{

    private double valor;

    public EstrategiaBuffDaño(double valor) {
        this.valor = valor;
    }

    @Override
    public TipoModificador getTipo() {
        return TipoModificador.DAÑO_HECHO;
    }

    @Override
    public double calcularModificacion(double danioActual) {
        return danioActual + valor;
    }
}
