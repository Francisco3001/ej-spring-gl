package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        CreadorPersonaje creadorGuerrero = new CreadorGuerrero();
        Personaje guerrero = creadorGuerrero.crearPersonaje();
        System.out.println("Guerrero: " + guerrero);

        CreadorPersonaje creadorOrco = new CreadorOrco();
        Personaje orco = creadorOrco.crearPersonaje();
        System.out.println("Orco: " + orco);

    }
}
