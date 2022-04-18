import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Iniciar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iniciar extends Actor
{
    /**
     * Este método permite iniciar el juego cuando se ha dado click en el boton iniciar, 
     * deteniendo la música inicial y cargando el primero escenario.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia de escenario y detiene la música inicial de la 
     * pantalla de inicio. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void iniciarJuego2() {
        if(seDioClicEnIniciar()) {
            PantallaDeInicio pantalla = getWorldOfType(PantallaDeInicio.class);
            pantalla.detenerMusica();
            cargarPrimerEscenario();
        }
    }

    /**
     * Este método permite cambiar cambiar de escenario, iniciando los nuevos componenetes del juego.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    private void cargarPrimerEscenario() {
        Greenfoot.setWorld(new Escenario1());
    }

    /**
     * Este método verifica si se dio clic sobre el menu inicio.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Ninguna <br>
     * 
     * @return true si se dio clic, false en caso contrario.
     * @author Juan José Carmona Y Daniel Berrío.
     */
    private boolean seDioClicEnIniciar() {
        return Greenfoot.mouseClicked(this);
    }

    public void act() {
        iniciarJuego2();
    }    
}

