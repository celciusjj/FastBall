import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bosque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private Vida vida1;
    private Vida vida2;
    private Vida vida3;
    private Enemigo enemigo;

    //Se crea el contador del juego el cual permite contar la cantidad de puntos en el juego.
    Puntaje puntaje = new Puntaje();
    /**
     * Constructor for objects of class Bosque.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1100, 600, 1, false); 
        setPaintOrder(Vida.class, Suelo.class, Enemigo.class);
        vida1 = new Vida();
        addObject(vida1, 40,40);
        vida2 = new Vida();
        addObject(vida2, 110,40);
        vida3 = new Vida();
        addObject(vida3, 180,40);
        enemigo = new Enemigo();
        addObject(enemigo, 300,60);

        //Agrega el puntaje al mundo.
        addObject (puntaje, 980, 60);
    }

    public  Puntaje getPuntaje (){
        return puntaje;

    }

    public void cambiarMundo(){
    }
}