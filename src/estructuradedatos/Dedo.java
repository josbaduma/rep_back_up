package estructuradedatos;

/**
 *
 * @author kevin
 */

/* Clase que define un objeto Dedo, el cual sera de utilidad a la hora de
 * realizar los movimientos en la mano. Se crean cuatro variables globales: dedo,
 * movimiento, grados, tiempo. Dedo es un String que indica el dedo de la mano
 * que se va a mover. Movimiento es un booleano que es true si el movimiendo es
 * recto, false en el caso de que sea circular. Grados es un entero que indica
 * los grados que debe girar el dedo correspondiente. Tiempo es un entero que representa
 * el equivalente de los grados en milisegundos.
 */
public class Dedo {

    private String dedo;
    private boolean movimiento;
    private int grados;
    private int tiempo;

    public Dedo(String dedo, boolean movimiento, int grados, int tiempo) {
        this.dedo = dedo;
        this.movimiento = true;
        this.grados = grados;
        this.tiempo = tiempo;
    }
   public Dedo(){
       this.dedo = "";
        this.movimiento = true;
        this.grados = 0;
        this.tiempo = 0;
   }

    public String getDedo() {
        return dedo;
    }

    public void setDedo(String dedo) {
        this.dedo = dedo;
    }

    public boolean isRecto() {
        return movimiento;
    }

    public void setRecto(boolean recto) {
        this.movimiento = recto;
    }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
   
   
}
