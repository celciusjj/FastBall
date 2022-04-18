import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BolaDeFuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BolaDeFuego extends Actor
{
    private int velX = 7;

    /**
     * Este método permite eliminar la esfera cuando esta
     * haya detectado la colision con el disparo.
     * <b> Pre-condición: <b\> Ninguna <br>
     * <b> Pos-condición: <b\> Elimina la esfera cuando ha colisionado con un disparo<br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */
    public void matarEsfera (){
        Esfera esfera = (Esfera)this.getOneIntersectingObject(Esfera.class);
        if (esfera !=null){
            getWorld().removeObject(esfera);
            Greenfoot.stop();
        }
    }
  
    /**
     * Act - do whatever the BolaDeFuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        matarEsfera();
        setLocation (getX() - velX, getY());
        if (getX()<10){
            this.getWorld().removeObject(this);
        }
    }    
}
