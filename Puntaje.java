import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntaje extends Actor
{
    private int puntaje = 0;
    private Mundo score;
    
   
    /**
     * Act - do whatever the Puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        setImage(new GreenfootImage(" Puntaje: " + puntaje , 24, Color.BLACK, Color.WHITE)); 
    }    

    /**
     * Este método permite contar la cantidad de puntajes que está recogiendo la esfera.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Aumenta la cantidad de puntaje cuando la esfera haya recogido alguna
     * bonificación. <br>
     * getPuntaje()
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    public void contar(){
        puntaje++;
    }

}
