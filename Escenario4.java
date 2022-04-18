import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario4 extends Mundo
{
    private Bloque bloque;
    private Bonificacion naranja;
    private Esfera esfera;
    private BloqueR bloqueR;
    private BloqueM bloqueM;
    private int ciclosParaGenerarBloquesM;
    private int ciclosParaGenerarBloquesM2 = 10;
    /**
     * Constructor for objects of class Escenario4.
     * 
     */
    public Escenario4()
    {    

        //Agrega la esfera al mundo después de haber cambiado de escenario.
        esfera = new Esfera();
        addObject(this.esfera, 70, 355);
        //Agrega los bloques al mundo
        bloque = new Bloque();
        addObject(bloque, 100, 400);
        //2
        bloqueR = new BloqueR (); 
        addObject(bloqueR, 500, 400);

        //3
        //6
        bloque = new Bloque();
        addObject(bloque, 980, 400);
    }

    public void act(){
        ciclosParaGenerarBloques();
        ciclosParaGenerarBloques2();

    }

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario5());
    }

    private void ciclosParaGenerarBloques(){
        if (ciclosParaGenerarBloquesM2 <=0){
            bloqueM = new BloqueM("abajo");
            this.addObject(bloqueM,300, 0);

            ciclosParaGenerarBloquesM2 = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosParaGenerarBloquesM2--;
    }

    private void ciclosParaGenerarBloques2(){
        if (ciclosParaGenerarBloquesM <=0){
            bloqueM = new BloqueM("arriba");
            this.addObject(bloqueM, 760, 580);

            ciclosParaGenerarBloquesM = Greenfoot.getRandomNumber(1)+140;
        }
        ciclosParaGenerarBloquesM--;

    }
    

    
    
    
}
