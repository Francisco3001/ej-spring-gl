package com.example;
import java.util.Random;

public class EstrategiaAleatoria implements EstrategiaDeAtaque{
    private Random random = new Random();
    @Override
    public int calcularDaño(int daño, TipoPersonaje tipoPersonaje) {
        int variacion = random.nextInt(11) - 5; // -5 a +5
        return daño + variacion;
    }
    
}