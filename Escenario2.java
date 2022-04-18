import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario2 extends Mundo
{
    private Bloque bloque;
    private BloqueM bloqueM;
    private BloqueR bloqueR;
    private Bonificacion naranja;
    private Esfera bola;
    private int ciclosParaGenerarBloquesM;
    
    
    Puntaje puntaje = new Puntaje();
    
    /**
     * Constructor for objects of class Escenario2.
     * 
     */
    public Escenario2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        //Se crean los bloques del siguiente escenario.
        //1
        //Crea la esfera
        this.bola = new Esfera();
        this.addObject(this.bola, 60, 412);
        
        
        
        bloque = new Bloque();
        addObject(bloque, 85, 460);
        

        //3
        bloqueR = new BloqueR (); 
        addObject(bloqueR, 500, 400);
     
        //4
        bloque = new Bloque ();
        addObject(bloque, 799, 400);
        //5
        bloque = new Bloque();
        addObject(bloque, 1000, 230);
        
        
        //Se agregan las bonificaciones al mundo
        
        naranja = new Bonificacion("bosque");
        addObject(naranja, 500, 300);
        
         

    }
    
    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario3());
       
    }
    
    public void act(){
        ciclosParaGenerarBloques();
        
    }
    
        private void ciclosParaGenerarBloques(){
        if (ciclosParaGenerarBloquesM <=0){
            bloqueM = new BloqueM("abajo");
            this.addObject(bloqueM,310, 0);

            ciclosParaGenerarBloquesM = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosParaGenerarBloquesM--;
    }
 
   
    
}
