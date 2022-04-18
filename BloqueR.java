import greenfoot.*;

public class BloqueR extends Plataforma
{
    private int velocidad = 2;

    public void act() 
    {
        bordes();
        move(velocidad);
    }    

    /**
     * Este método se encarga de verificar si el bloque ha llegado hasta un borde
     * ya determinado, de ser así su velocidad cambiará.
     * <b> Pre-Condición: <b/> Ninguna <br> 
     * <b> Pos-Condición: <b/> Cambia la velocidad del bloque, cuando este haya llegado hasta 
     * una posición.
     * 
     * @authir Juan José Carmona Y Daniel Berrío Barrera.
     */
    public void bordes()
    {
        if(getX() < 460 || getX() > getWorld().getWidth() - 490){
            velocidad *= -1;
        }   
    }

}
