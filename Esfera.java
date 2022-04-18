import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es la que implementa todo el comportamiento de la clase del juego
 * 
 * Juan Jose Carmona Montes y Daniel Berrío Barrera.
 * @version 0.1
 */
public class Esfera extends Actor
{
    //Atributos de la esfera
    private double velocidad = 0.0;
    private int velX = 3;
    private boolean estaSaltando = false;
    private int frame = 0;

    private Escenario1 musica;

    //Constantes de la esfera
    public static  double GRAVEDAD = 0.5;
    public static final double IMPULSO = 13;

    /**
     * Este mètodo invoca las acciones que puede hacer el personaje.
     *
     */
    public void act() 
    {
        if  (Greenfoot.isKeyDown ("w") && !estaSaltando){
            //Hace que la esfera salte
            this.saltar();
            Greenfoot.playSound("salto.mp3");
        }else if (estaSaltando){
            //Hace que la esfera caiga
            this.caer();
        }
        //Impide que la esfera se salga del recuadro del juego.
        if (getY()<=1){
            setLocation(getX(), 1);
        }

        mover();
        estaEncimaDeUnBloque();

        siguienteNivel();
        colisionBloque();
        colisionBonificacion();
        matarEsfera();

    }

    /**
     * Este método se encarga se hacer que la esfera caiga, cuando 
     * no ha detectado colisión con un bloque.
     * <b> Pre-Condición: <b\> Ninguna <br>
     * <b> Pos-Condición: <b\> Modifica la posición de la esfera cuando, esta 
     * no esta encima de un bloque, en este caso cae.<br
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    private void caer()
    {
        //Cambia la velocidad de caida de la bola 
        this.velocidad += this.GRAVEDAD;

        //obtiene y modifica la posiciòn en x e y de la bola
        int x = this.getX();
        int y = (int)(this.getY() + this.velocidad);
        estaSaltando = true;
        //Mueve la esfera a la nueva posiciòn
        this.setLocation(x, y);
    }

    /**
     * Este método permite mover la esfera si se esta presionando una tecla, 
     * además se genera la animación cuando esta se está moviendo.
     * <b> Pre-Condición: <b\> Ninguna <br>
     * <b> Pos-Condición: <b\> Se cambia la posición de la esfera y además
     * se cambia la imagen de acuerdo a la animaacion generada. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */
    private void mover (){
        velX += 0.001;
        if (Greenfoot.isKeyDown("d")){
            setLocation (getX()+ velX, getY());

            frame++;

            if (frame > 18){
                frame = 1;
            }
            this.setImage("esferaMarte"+frame+".png");

        }
    }

    /**
     * Este método permite que la esfera salte.
     * <b> Pre-Condición: <b\> Ninguna <br>
     * <b> Pos-Condición: <b\> Cambia la velocidad de movimiento vertical
     * y cambia la posición vertical de la esfera.<br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    private void saltar()
    {
        //Cambio la velocidad a velocidad constante
        this.velocidad = -IMPULSO;
        estaSaltando = true;

        //obtiene y modifica la posiciòn en x e y de la esfera
        int x = this.getX();
        int y = (int)(this.getY() + this.velocidad);

        //Mueve la esfera a la nueva posicion
        this.setLocation(x, y);
    }

    /**
     * Este método verifica si la esfera está encima de una plataforma.
     * <b>Pre-Condición: </b> Ninguna <br>
     * <b>Post-Condición: </b> Ninguna <br>
     * 
     * @return True si el personaje está encima de una plataforma. False, en 
     * caso contrario
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    public boolean estaEncimaDeUnBloque(){
        int imgHeight = getImage().getHeight();

        //Calculo la distancia vertica a la que debe estar un bloque
        //para que se considere que se está encima de él.
        int yDistance = (int)(imgHeight/2) + 5;

        Actor bloque = getOneObjectAtOffset(0, yDistance, Plataforma.class);
        if (bloque == null){
            estaSaltando = true;
            return false;
        }else{
            mantenerSobreElBloque(bloque);
            return true;
        }
    }

    /**
     * Este método permite mantener la esfera encima del bloque.
     * <b> Pre-Condición: <b\> Ninguna <br> 
     * <b> Pos-Condición: <b\> Se cambia la posición en x de la esfera, al nueva posición 
     * que es la que posee el bloque. <br>
     * 
     * @parametros Actor Plataforma, permite conocer si la esfera esta encima de alguna 
     * plataforma.
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    public void mantenerSobreElBloque(Actor Plataforma){
        int imgHeight = getImage().getHeight();

        int newY = Plataforma.getY() - (imgHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        estaSaltando = false;
    }

    /**
     * Este método verifica la colisión por la derecha, o por arriba del personaje.
     * La colisión se verifica es con las plataformas.
     * <b> Pre-condición : <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Si hay colisión, cambia la coordenada X o y del personaje. <br>
     * 
     * @author Juan Jose Carmona Y Daniel Berrío
     */
    public void colisionBloque (){
        Actor p;
        int W = this.getImage().getWidth();
        int B = (int) W/2;
        int A = this.getImage().getHeight();
        int D = (int) A/2;

        p= getOneObjectAtOffset(B, 0, Plataforma.class);
        if (p!=null){

            int K = p.getImage().getWidth();
            int P = p.getX()-(K+W)/2;
            setLocation(P, this.getY());

        }

        p = getOneObjectAtOffset(0, -A, Plataforma.class);
        if (p!=null){
            this.velocidad += this.GRAVEDAD;
            int K = p.getImage().getHeight();
            int P = p.getY()+(A+K)/2;
            setLocation(getX(), P);
        }

    }

    /**
     * Este método permite cambiar de escenario, siempre y cuando la esfera
     * este en el limite derecho de la pantalla.
     * <b> Pre-Condición: <b\> Ninguna <br>
     * <b> Pos-Condición: <b\> Cambia la posición de la esfera, y la ubica en otro escenario. <br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera.
     */
    private void siguienteNivel()
    {

        if(getX() >= getWorld().getWidth() - 5)
        {
            ((Mundo)getWorld()).cambiarMundo();

        }
    }

    /**
     * Este método permite eliminar la bonificación cuando la esfera,
     * haya detectado la colision.
     * <b> Pre-condición: <b\> Ninguna <br>
     * <b> Pos-condición: <b\> Se elimina la bonificación cuando esta haya detectado
     * una colisión con la esfera<br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */
    public void colisionBonificacion (){
        Bonificacion naranja = (Bonificacion)this.getOneIntersectingObject(Bonificacion.class);
        if (naranja !=null){
            getWorld().removeObject(naranja);
            Greenfoot.playSound("bonificacion.mp3");
            //Cuenta las bonificaciones que la esfera ha recogido.
            World mundo = getWorld();
            Mundo puntaje = (Mundo)mundo;
            Puntaje contador = puntaje.getPuntaje();
            contador.contar();

        }
    }

    /**
     * Este método permite eliminar la esfera cuando esta
     * haya detectado la colision con el disparo, cuando ha tocado la parte inferior de la pantalla, cuando haya colisionado
     * con una bola de fuego o cuando haya impactado contra el ave, mostrando una imagen de "GameOver".
     * además mostrará 
     * <b> Pre-condición: <b\> Ninguna <br>
     * <b> Pos-condición: <b\> Elimina la esfera cuando ha colisionado con un disparo<br>
     * 
     * @author Juan José Carmona Y Daniel Berrío Barrera
     */

    public void matarEsfera (){
        Disparo huevo = (Disparo)this.getOneIntersectingObject(Disparo.class);
        if (huevo !=null){
            getWorld().removeObject(huevo);
            Greenfoot.stop();
            Greenfoot.setWorld(new GameOver());
        }

        if(getY()>580){
            Greenfoot.stop(); 
            Greenfoot.setWorld(new GameOver());
        }

        BolaDeFuego fire = (BolaDeFuego)this.getOneIntersectingObject(BolaDeFuego.class);
        if(fire!=null){
            getWorld().removeObject(fire);
            Greenfoot.stop();
            Greenfoot.setWorld(new GameOver()); 
        }

        Enemigo pajaro = (Enemigo) this.getOneIntersectingObject(Enemigo.class);
        if (pajaro!=null){
            getWorld().removeObject(this);
            Greenfoot.stop();
            Greenfoot.setWorld(new GameOver());
        }

    }
}

