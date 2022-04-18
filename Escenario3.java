import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Escenario3 extends Mundo
{
    private Bonificacion naranja;
    private Bloque bloque;
    private Esfera esfera;
    private BloqueM bloqueM;
    private int ciclosParaGenerarBloquesM;
    private int ciclosParaGenerarBloquesM2 = 10;
    
    /**
     * Constructor for objects of class Escenario3.
     * 
     */
    public Escenario3()
    {    

                
        //Agrega la esfera al mundo, depués de haber pasado de escenario.
        esfera = new Esfera();
        addObject(this.esfera, 70, 355);
        //Agrega los bloques al mundo
        //1
        bloque = new Bloque();
        addObject(bloque, 90, 400);
        //2
        bloque = new Bloque();
        addObject(bloque, 300, 300);
        
        //6
        bloque = new Bloque();
        addObject(bloque, 1000, 400);

        //Agrega las bonificaciones al escenario
        naranja = new Bonificacion("bosque");
        addObject(naranja, 740, 100);

    }
    
    
    
    public void act(){
        ciclosParaGenerarBloques();
        ciclosParaGenerarBloques2();
    }
    
         private void ciclosParaGenerarBloques(){
        if (ciclosParaGenerarBloquesM2 <=0){
            bloqueM = new BloqueM("abajo");
            this.addObject(bloqueM,500, 0);

            ciclosParaGenerarBloquesM2 = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosParaGenerarBloquesM2--;
    }
    
         private void ciclosParaGenerarBloques2(){
        if (ciclosParaGenerarBloquesM <=0){
            bloqueM = new BloqueM("arriba");
            this.addObject(bloqueM, 750, 580);

            ciclosParaGenerarBloquesM = Greenfoot.getRandomNumber(1)+140;
        }
        ciclosParaGenerarBloquesM--;
    }
    

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario4());

    }

    
}
