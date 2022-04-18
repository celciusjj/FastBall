import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstruccionesEscenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstruccionesEscenario extends World
{
    public Atras atras;
   
    
    /**
     * Constructor for objects of class InstruccionesEscenario.
     * 
     */
    public InstruccionesEscenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        atras = new Atras();
        addObject(atras, 550, 570);
    }
}
