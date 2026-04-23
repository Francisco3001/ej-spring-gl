package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldCreateAGuerrero()
    {
        CreadorPersonaje creadorGuerrero = new CreadorGuerrero();
        Personaje guerrero = creadorGuerrero.crearPersonaje();

        assertTrue(guerrero.getTipo() == TipoPersonaje.GUERRERO);
    }
    public void shouldCreateAMago()
    {
        CreadorPersonaje creadorMago = new CreadorMago();
        Personaje mago = creadorMago.crearPersonaje();
        assertTrue(mago.getTipo() == TipoPersonaje.MAGO);
    }
    public void shouldCreateAnOrco()
    {
        CreadorPersonaje creadorOrco = new CreadorOrco();
        Personaje orco = creadorOrco.crearPersonaje();
        assertTrue(orco.getTipo() == TipoPersonaje.ORCO);
    }
}
