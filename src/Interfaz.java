/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteb
 */
public interface Interfaz {
    public String frecAdelante();
    public String frecAtras();
    public boolean prender();
    public boolean apagar();
    public String cambioFrecuencia();
    public void guardarFrec(float frec, int pos);
    public String mostrarEstacion();
    public String mostrarEstacionBoton(int pos);
}
