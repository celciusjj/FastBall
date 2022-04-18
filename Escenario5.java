import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario5 extends Mundo
{
    private Bonificacion naranja;
    private Bloque bloque;
    private Esfera esfera;
    /**
     * Constructor for objects of class Escenario5.
     * 
     */
    public Escenario5()
    {    
        //Agrega la esfera al mundo después de haber cambiado de escenario.
        esfera = new Esfera();
        addObject(this.esfera, 70, 250);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        bloque = new Bloque();
        addObject(bloque, 95, 380);
        //1
        bloque = new Bloque ();
        addObject(bloque, 300, 320);
        //2
        bloque = new Bloque();
        addObject(bloque, 540, 420);
        //3
        bloque = new Bloque();
        addObject(bloque, 800, 390);
        //4
        bloque = new Bloque();
        addObject(bloque, 1000, 400);

        //Agrega la bonificacion al mundo
        naranja = new Bonificacion("bosque");
        addObject(naranja, 780, 200);
    }
    

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario6());

    }
}
