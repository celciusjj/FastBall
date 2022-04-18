import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaDeInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaDeInicio extends World
{
    private Iniciar inicio;
    private Instrucciones instrucciones;
    private GreenfootSound musica =  new GreenfootSound("Intro.mp3");
    /**
     * Constructor for objects of class PantallaDeInicio.
     * 
     */
    public PantallaDeInicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        //Agrega el Iniciar
        inicio = new Iniciar();
        addObject(inicio, 300 , 270);

        //Agrega las instrucciones
        instrucciones = new Instrucciones();
        addObject(instrucciones, 300, 430);

    }
    /**
     * Este método permite detener la música de inicio del juego, 
     * cuando se ha dado empezado el juego.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Detiene la música de fondo del juego.
     * 
     * @author Juan José Carmona Montes y Daniel Berrío Barrera
     */
    public void detenerMusica(){
        musica.stop();
    }

    /**
     * Este método reproduce una melodia de fondo.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Reproduce la música ambiente del juego.
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     * 
     * 
     */
    protected void musicaDeFondo() {

        musica.playLoop();

    }

    public void act(){
        musicaDeFondo();
        //detenerMusica();
    }
}
