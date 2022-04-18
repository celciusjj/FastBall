import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario10 extends Mundo
{
    private Asteroide rock;
    private int ciclosAsteroide = 10;
    private Esfera esfera;
    private Meteoro meteoro;
    private int ciclosAsteroide2= 10;
    private int ciclosAsteroide3 = 10;
    private int ciclosAsteoride4 = 10;
    private int ciclosAsteoride5 = 10;

    /**
     * Constructor for objects of class Escenario7.
     * 
     */
    public Escenario10()
    {
        esfera = new Esfera();
        addObject(esfera, 90, 200);

        meteoro = new Meteoro();
        addObject(meteoro, 90, 250);

    }

    /**
     * Este método permite mover asteroides hacia arriba.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y del asteroide.
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void ciclosParaAsteroide (){
        if (ciclosAsteroide<=0){
            rock = new Asteroide ("arriba");
            addObject(rock, 300, 580);

            ciclosAsteroide = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosAsteroide--;

    }

    /**
     * Este método permite mover asteroides hacia abajo.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y del asteroide.
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void ciclosParaAsteroide2 (){
        if (ciclosAsteroide2<=0){
            rock = new Asteroide("abajo");
            addObject(rock, 550, 1);

            ciclosAsteroide2 = Greenfoot.getRandomNumber(2)+ 115;
        }
        ciclosAsteroide2--;
    }

    /**
     * Este método permite mover asteroides hacia arriba.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y del asteroide.
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void ciclosParaAsteroide3 (){
        if (ciclosAsteroide3<=0){
            rock = new Asteroide("arriba");
            addObject(rock, 720, 580);

            ciclosAsteroide3 = Greenfoot.getRandomNumber(5)+ 50;
        }
        ciclosAsteroide3--;
    }

    /**
     * Este método permite mover asteroides hacia abajo.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y del asteroide.
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void ciclosParaAsteroide4 (){
        if ( ciclosAsteoride4<=0){
            rock = new Asteroide("abajo");
            addObject(rock, 900, 1);

            ciclosAsteoride4= Greenfoot.getRandomNumber(2)+ 115;
        }
        ciclosAsteoride4--;
    }

    /**
     * Este método permite mover asteroides hacia abajo.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y del asteroide.
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    public void ciclosParaAsteroide5 (){
        if ( ciclosAsteoride5<=0){
            rock = new Asteroide("abajo");
            addObject(rock, 1050, 1);

            ciclosAsteoride5= Greenfoot.getRandomNumber(2)+ 115;
        }
        ciclosAsteoride5--;
    }

    public void act (){
        ciclosParaAsteroide();
        ciclosParaAsteroide2();
        ciclosParaAsteroide3();
        ciclosParaAsteroide4();
        ciclosParaAsteroide5();
    }

    /**
     * Este método permite cambiar cambiar de escenario, iniciando los nuevos componenetes del juego.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario.
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    public void cambiarMundo(){
        Greenfoot.setWorld(new GameOver());

    }
}

