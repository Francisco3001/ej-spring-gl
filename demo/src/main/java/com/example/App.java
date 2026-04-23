package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ataque ataque1 = new Ataque("ataqueFuego", 20, 5, new EstrategiaSimple());
        Ataque ataque2 = new Ataque("ataqueEspada", 40, 3, new EstrategiaSimple());
        Ataque ataque3 = new Ataque("ataqueFuegoRandom", 20, 5, new EstrategiaAleatoria());
        Ataque ataque4 = new Ataque("ataqueEspadaComplejo", 30, 3, new EstrategiaCompleja());

        Modificador modificador1 = new Modificador("suma 50 de daño", new EstrategiaBuffDaño(50));
        Modificador modificador2 = new Modificador("recibe 20 menos de daño", new EstrategiaDebuffDaño(20));


    }
}
