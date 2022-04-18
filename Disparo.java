import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Juan José Carmona y Daniel Berrío Barrera 
 * @version 2
 */
public class Disparo extends Actor
{
    private int velY =  5;
    private int frame;

    

    /**
     * Este metodo permite generar los disparos que produce el enemigo.
     * <b> Pre-Condición: <b\> Ninguna <br> 
     * <b> Pos-Condición: <b\> Elimina el disparo cuando este ha llegado a la parte 
     * inferior de la pantalla <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */
    public Disparo (String lugar){ 
        if (lugar.equals("bosque")){
            frame = Greenfoot.getRandomNumber (3)+1;
            setImage("Huevo"+frame+".png");

        }
        if (lugar.equals("espacio")){
            frame = Greenfoot.getRandomNumber (3)+1;
            setImage("HuevoEspacio_"+frame+".png");
        }
    }


    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation(getX(), getY() + velY);
        if (getY() > 580){
            this.getWorld().removeObject(this);
        }    
    }
}
