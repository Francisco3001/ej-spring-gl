package com.example;

public class EstrategiaDebuffDaño implements EstrategiaDeModificador {

    private double valor;

    public EstrategiaDebuffDaño(double valor) {
        this.valor = valor;
    }

    @Override
    public TipoModificador getTipo() {
        return TipoModificador.DAÑO_RECBIDO;
    }

    @Override
    public double calcularModificacion(double danioActual) {
        return danioActual - valor;
    }
}