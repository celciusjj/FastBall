import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Plataforma
{
    private int velY = 4;
    /**
     * Este método constructor permite mover los asteroides hacia arriba  o hacia abajo, 
     * recibiendo como parámetros una dirección, la cual determinará hacia qué lugar moverse.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos- Condición: <b/> Cambia la posición en Y de la plataforma. <br>
     * 
     * @ Parametros: la dirección deberá tomar los valores arriba para desplazarse hacia ese
     * lugar o hacia abajo, para moverse.
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    public Asteroide (String dir){
        if (dir.equals("arriba")){
            velY = -4;    
        }

        if (dir.equals("abajo")){
            velY = 4;
        }

    }
    
    /**
     * 
     */
    public void act() 
    {
        
        setLocation(getX(), getY()+ velY);
        
        if (getY()>580){
            getWorld().removeObject(this);
        }
        
        
        
    }    

    
    
    
}

