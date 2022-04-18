import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Volver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Atras extends Actor
{
    

    /**
     * 
     * 
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia de escenario y detiene la música inicial de la 
     * pantalla de inicio. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void volverInicio() {
        if(seDioClick()) {
            PantallaDeInicio pantalla = getWorldOfType(PantallaDeInicio.class);
            pantalla.detenerMusica();
            cargarInicio();
            
        }
    }

    /**
     * Este método permite cambiar cambiar de escenario, volviendo al mundo de inicio.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    private void cargarInicio() {
        Greenfoot.setWorld(new PantallaDeInicio());
    }

    /**
     * Este método verifica si se dio clic sobre la clase atras.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Ninguna <br>
     * 
     * @return true si se dio clic, false en caso contrario.
     * @author Juan José Carmona Y Daniel Berrío.
     */
    private boolean seDioClick() {
        return Greenfoot.mouseClicked(this);
    }

    public void act() {
        volverInicio();
    }      
}
