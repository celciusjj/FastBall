import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario1 extends Mundo
{
    //Atributos
    private static final GreenfootSound musica =  new GreenfootSound("musica2.mp3");
    private Esfera bola;
    private Vida vida;
    private Bloque bloque;
    //Asteroide
    private BloqueM bloqueM;

    //Bonificación
    private Bonificacion naranja;

    //bloque suelo
    private Suelo suelo2;
    private Suelo suelo;

    private BolaDeFuego fuego;
    private int ciclosParaGenerarBloquesM = 10;
    private int ciclosParaGenerarBolasDeFuego = 100;

    

    /**
     * Constructor for objects of class Escenario.
     * 
     */
    public Escenario1()
    {    

        //Agrega la esfera al mundo.
        this.bola = new Esfera();
        this.suelo = new Suelo();
        this.addObject(this.bola, 30, 535);

        //Agrega la bonificacion al mundo.
        naranja = new Bonificacion("bosque");
        addObject(this.naranja, 185, 400);

        //Agrega la plataforma de inicio donde esta montada la esfera
        // al comienzo del juego.

        this.suelo = new Suelo();
        suelo2 = new Suelo();

        this.addObject(this.suelo, 20, 580);    
        this.addObject(suelo2, 70, 580);

        // Agrega los bloques al mundo.
        //1
        this.bloque = new Bloque();
        addObject(bloque, 180, 500);
        //2
        this.bloque = new Bloque();
        addObject(bloque, 555, 435);
        //3
        this.bloque = new Bloque();
        addObject(bloque, 690, 300);
        //4
        this.bloque = new Bloque();
        addObject(bloque, 840, 200);
        //5
        this.bloque = new Bloque();
        addObject(bloque, 1000, 560);

        addObject (puntaje, 980, 60);

    }

    /**
     * Este método permite mover asteroides hacia  arriba o hacia abajo.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y del asteroide. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    private void ciclosParaGenerarBloques(){
        if (ciclosParaGenerarBloquesM <=0){
            bloqueM = new BloqueM("abajo");
            this.addObject(bloqueM,350, 0);

            ciclosParaGenerarBloquesM = Greenfoot.getRandomNumber(1)+110;
        }
        ciclosParaGenerarBloquesM--;

    }

    /**
     * Este método permite mover y generar las bolas de fuego en el escenario de juego.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia la posición en Y y X de la bola de fuego. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío.
     */
    private void ciclosParaGenerarBolas(){
        if (ciclosParaGenerarBolasDeFuego <= 0){
            fuego = new BolaDeFuego();
            int y = Greenfoot.getRandomNumber (60) +  300;

            addObject(fuego, 1100 , y);

            ciclosParaGenerarBolasDeFuego = Greenfoot.getRandomNumber (100) +300;

        }
        ciclosParaGenerarBolasDeFuego --;

    }

    /**
     * Este método reproduce una melodía de fondo.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Reproduce la música ambiente del juego. <b
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     * 
     * 
     */
    protected void musicaDeFondo() {
        if(!musica.isPlaying()) {
            musica.playLoop();
        }
    }

    public void act(){
        ciclosParaGenerarBloques();
        musicaDeFondo();
        ciclosParaGenerarBolas();
    }

    /**
     * Este método permite cambiar de escenario, iniciando los nuevos componentes del juego.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario.<br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */

    public void cambiarMundo(){
        Greenfoot.setWorld(new Escenario2());

    }

    
    

}
