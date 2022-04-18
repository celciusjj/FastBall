import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario8 extends Mundo
{
    private Asteroide rock;
    private int ciclosAsteroide = 10;
    private Esfera esfera;
    private Meteoro meteoro;

    /**
     * Constructor for objects of class Escenario7.
     * 
     */
    public Escenario8()
    {
        esfera = new Esfera();
        addObject(esfera, 90, 300);

        meteoro = new Meteoro();
        addObject(meteoro, 90, 360);


        meteoro = new Meteoro();
        addObject (meteoro, 500, 400);

        meteoro = new Meteoro();
        addObject(meteoro, 750, 550);

        meteoro = new Meteoro ();
        addObject(meteoro, 950, 450);

    }
    public void ciclosParaAsteroide (){
        if (ciclosAsteroide<=0){
            rock = new Asteroide ("arriba");
            addObject(rock, 300, 580);

            ciclosAsteroide = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosAsteroide--;

    }

    public void act (){
        ciclosParaAsteroide();

    }

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario9());

    }
}
