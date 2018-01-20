/**
 *
 * @author Oliver Mazariegos
 * @author Esteban Cabrera
 * @since 12/01/18
 */
public class Boton {
    private float emisora;
    private int posicion;
    
    public Boton(float emisora, int posicion){
        this.emisora = emisora;
        this.posicion = posicion + 1;
    }
    /**
    * este metodo devuelve la frecuencia de la emisora
    *@return String
    */
    public String getEmisora(){
        return Float.toString(emisora);
    }
    /**
    * este metodo devuelve el boton en el que esta guardado la emisora
    *@return String
    */
    public String getPosicion(){
        return Float.toString(posicion);
    }
    
}
