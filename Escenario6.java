import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario6 extends Mundo
{
    private Asteroide roca;
    private Meteoro piedra;
    private Esfera esfera;
    private int ciclosParaAsteroides ;

    /**
     * Constructor for objects of class Escenario6.
     * 
     */
    public Escenario6()
    {
        piedra = new Meteoro();
        addObject(piedra, 40, 400);

        esfera = new Esfera();
        addObject(esfera, 50, 320);

        piedra = new Meteoro();
        addObject(piedra, 350, 300);

        piedra = new Meteoro();
        addObject(piedra, 560, 330);

        piedra = new Meteoro();
        addObject(piedra, 760, 530);

        piedra = new Meteoro();
        addObject(piedra, 950, 400);

    }

    public void generarAsteroides (){
        if (ciclosParaAsteroides<=0){
            roca = new Asteroide("abajo");
            addObject(roca, 200, 0);

            ciclosParaAsteroides = Greenfoot.getRandomNumber(2)+115;

        }
        ciclosParaAsteroides--;

    }

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario7());

    }

    public void act (){
        generarAsteroides();
    }

}
