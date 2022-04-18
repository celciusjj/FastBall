import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario9 extends Mundo
{
    private Asteroide rock;
    private int ciclosAsteroide = 10;
    private Esfera esfera;
    private Meteoro meteoro;
    private int ciclosAsteroide2 = 10;

    /**
     * Constructor for objects of class Escenario7.
     * 
     */
    public Escenario9()
    {
        esfera = new Esfera();
        addObject(esfera, 90, 200);

        meteoro = new Meteoro();
        addObject(meteoro, 90, 250);


        meteoro = new Meteoro();
        addObject (meteoro, 500, 400);

        
        meteoro = new Meteoro();
        addObject(meteoro, 710, 370);
        
        meteoro = new Meteoro();
        addObject(meteoro, 850, 500);

        
        
        
        
        

    }
    public void ciclosParaAsteroide (){
        if (ciclosAsteroide<=0){
            rock = new Asteroide ("arriba");
            addObject(rock, 300, 580);

            ciclosAsteroide = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosAsteroide--;

    }

    public void ciclosParaAsteroide2 (){
        if (ciclosAsteroide2<=0){
            rock = new Asteroide("abajo");
            addObject(rock, 1050, 1);

            ciclosAsteroide2 = Greenfoot.getRandomNumber(2)+ 115;
        }
        ciclosAsteroide2--;
    }

    public void act (){
        ciclosParaAsteroide();
        ciclosParaAsteroide2();
    }

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario10());

    }
}
