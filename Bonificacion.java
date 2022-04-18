import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonificacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonificacion extends Actor
{

    public Bonificacion (String escenario){
        ;

        if (escenario.equals("bosque")){
            this.setImage("fruta.png");
        }
        if (escenario.equals("espacio")){
            this.setImage("fruta.png");
        }
    }

    /**
     * Act - do whatever the Bonificacion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    


    
}
