import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * Juan José Carmona Montes y Daniel Berrío Barrera.
 * @version (a version number or a date)
 */
public class BloqueM extends Plataforma
{

    private int velY = 3;
    /**
     * Este método constructor permite mover los bloques hacia arriba  o hacia abajo, 
     * recibiendo como parámetros una dirección, la cual determinará hacia qué lugar moverse.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos- Condición: <b/> Cambia la posición en Y de la plataforma. <br>
     * 
     * @ Parametros: la dirección deberá tomar los valores arriba para desplazarse hacia ese
     * lugar o hacia abajo, para moverse.
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    public BloqueM(String direccion){
        if (direccion.equals("arriba")){
            velY = -3;
        }

        if (direccion.equals("abajo")){
            velY = 3;
        }
    }

    public void act(){
        setLocation(getX(), getY()+ velY);

        if(this.getY() > 580){
            this.getWorld().removeObject(this); 
        } 

    }
}
