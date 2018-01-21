/**
 *
 * @author Oliver Mazariegos
 * @author Esteban Cabrera
 * @since 12/01/18
 */
public class Radio implements Interfaz{
    private boolean encendido;
    private String frecActual;
    private String fm;
    private String am;
    private Boton emisoras[];
    private boolean estado; //true es FM
    
    
    public Radio(){
        fm = "87.90";
        am =  "530";
        emisoras = new Boton[10];
        estado = true; // true es FM
        encendido = false;
        frecActual = fm;
    }
    /**
    * este metodo aumenta una posicion de frecuencia hacia adelante
    *
    *@return String
    * 
    */
    public String frecAdelante(){
        if (estado == true){
            float frecFM = Float.parseFloat(fm);
            frecFM += 0.2;
            fm = String.format("%.2f", frecFM);
            frecActual = fm;
            return (frecActual + "FM");
        }
        else{
            int frecAM = Integer.parseInt(am);
            frecAM += 10;
            frecActual = String.valueOf(frecAM);
            am = frecActual;
            return frecActual + "AM";
        }
    }
    /**
    * este metodo disminuye una posicion de frecuencia hacia adelante
    *
    *@return String
    * 
    */
    public String frecAtras(){
        if (estado == true){
            float frecFM = Float.parseFloat(fm);
            frecFM -= 0.2;
            fm = String.format("%.2f", frecFM);
            frecActual = fm;
            return (frecActual + "FM");
        }
        else {
            int frecAM = Integer.parseInt(am);
            frecAM -= 10;
            frecActual = String.valueOf(frecAM);
            am = frecActual;
            return frecActual + "AM";
        }
    }
    
    public String obtenerEstacion(int pos){
        String tipo = "";
        if (emisoras[pos].getTipo()){
            tipo = "FM";
            this.estado = true;
        } else {
            tipo = "AM";
            this.estado = false;
        }
        return emisoras[pos].getEmisora() + tipo;
    }
    
    /**
    * este metodo enciende la radio
    *@return double
    */
    public boolean prender(){
        encendido = true;
        return encendido;
    }
    /**
    *este metodo apaga la radio
    *@return double
    */
    public boolean apagar(){
        encendido = false;
        return encendido;
    }
    /**
    *este metodo cambia la radio de AM a FM o FM a AM
    *@return String
    */
    public String cambioFrecuencia(){
        if(estado == true){
            estado = false;
            return "AM";
        }
        else{
            estado = true;
            return "FM";
        } 
    }
    /**
    *este metodo crea un Boton, el cual recibe una frecuecia AM y la posicion del boton
    * @param frecuencia la frecuencia AM que se guardara
    * @param posicion la posicion en que se va a guardar el boton
    */
    public void guardarEstacionActual(int pos){
        Boton nuevoBoton;
        nuevoBoton = new Boton(this.frecActual, this.estado, pos); 
        emisoras[pos] = nuevoBoton;
    }
    /**
    *este metodo crea un Boton, el cual recibe una frecuecia FM y la posicion del boton
    * @param frecuencia la frecuencia FM que se guardara
    * @param posicion la posicion en que se va a guardar el boton
    */

    /**
    * este metodo devuelve un string que contiene la frecuencia en la qu esta el radio
    * @return String de la frecuencia
    */
    public String mostrarEstacion(){
        if(estado == true){
            return fm;
        }
        else{
            return am;
        } 
    }
    
    public String getFrecActual(){
        return frecActual;
    }
    
    public String getFm(){
        return String.valueOf(this.fm);
    }
    
    public String getAm(){
        return String.valueOf(this.am);
    }
    
    public boolean isPrendido(){
        return this.encendido;
    }
    
    public void setEstado(boolean nuevoEstado){
        this.estado = nuevoEstado;
    }
    
    public boolean isEstado(){
        return this.encendido;
    }

    public int getEmisoraSize(){
        int contador = 0;
        boolean stop = false;
        do {
            if (emisoras[contador] == null){
                stop = true;
            } else { 
                contador++;
            }
        } while (!stop);
        return contador;
    }
    @Override
    public void guardarFrec(float frec, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mostrarEstacionBoton(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
    
}




