/**
 *
 * @author Oliver Mazariegos
 * @author Esteban Cabrera
 * @since 12/01/18
 */
public class Boton {
    private String emisora;
    private Boolean tipo;
    private int posicion;
    
    public Boton(String emisora, boolean tipo, int posicion){
        this.emisora = emisora;
        this.tipo = tipo;
        this.posicion = posicion + 1;
    }
    /**
    * este metodo devuelve la frecuencia de la emisora
    *@return String
    */
    public String getEmisora(){
        return this.emisora;
    }
    /**
    * este metodo devuelve el boton en el que esta guardado la emisora
    *@return String
    */
    public boolean getTipo(){
        return this.tipo;
    }
    
    public String getPosicion(){
        return Float.toString(posicion);
    }
    
}
