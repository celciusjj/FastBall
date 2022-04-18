import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    //Atributos del ave
    private double velocidad = 0.0;
    private int frame = 0;
    private int velX = 3;
    private int contador = 10;
    private int escenario = 1;
    private boolean seMueve=false;

    /**
     * Este método permite eliminar el enemigo cuando llegue a la parte 
     * superior derecha de la pantalla.
     * <b> Pre-Condicion: <b\> Ninguna <br> 
     * <b> Pos-Condición: <b\> Se elimina el enemigo cuando llega a la parte 
     * superior derecha de la pantalla <br>
     * 
     * @author Juan José Carmona y Daniel Berrío Barrera
     */
    public void eliminarEnemigo (){
        if (this.getX()<300){
            this.getWorld().removeObject(this);
        }
    }

    /**
     * Este método se encarga de hacer que la animación de disparo del enemigo, 
     * además permite eliminar el ave cuando ha llegado al limite superior izquierdo
     * de la pantalla.
     * <b> Pre-Condición: <b\> Ninguna <br>
     * <b> Pos-Condicion: <b\> Se genera la animación del disparo del enemigo, y además 
     * elimina el enemigo cuando este ha llegado al limite izquierdo de la pantalla.<br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */
    private void disparar()
    {
        if(this.getX()<=1090){
            if (contador <= 0){
                Disparo disparo = new Disparo("bosque"); //
                this.getWorld().addObject(disparo, this.getX()-10, this.getY()); //
                contador = 105;
            }
            contador --;
        }else{
            this.getWorld().removeObject(this);
        }
    }

    /**
     * Este método cambia la posición del enemigo y genera la animación de vuelo
     * de este.
     * <b> Pre-Condición: <b\> Ninguna <br>
     * <b> Pos-Condición: <b\> Se Cambia de posición el enemigo,
     * y además se cambia la imagen de acuerdo a la animación generada.
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */
    public void hacerVolar(){

        setLocation(getX() + velX, getY());
        if (this.getX()<30){
            velX = 3;
            setLocation(getX() + velX, getY());
        }

        if (velX>0){
            this.setImage("Bird_"+frame+".png");
        }

        if (this.getX()==1050){
            velX = -3;
            setLocation(getX() + velX, getY());
            if (velX<0){
                this.setImage("Bird_"+frame+"Rotado.png");
            }

        }
        
        if (velX<0){
            this.setImage("Bird_"+frame+"Rotado.png");
        }
    }

    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        frame ++;
        if (frame > 8){
            frame = 1;
        }
        hacerVolar();
        disparar();

    }
}
