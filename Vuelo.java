package javaapplication18;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Vuelo {

    // Atributos
    private int numVuelo;
    private String origen;
    private String destino;
    private Date horasalida;
    private Date fecha;


    
    /* Metodo Constructor 
      
    
      Complejidad temporal: O(N)Tiempo Constante 
    */    
    public Vuelo(int numVuelo, String origen, String destino, Date horasalida, Date fecha) {
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.horasalida = horasalida;
        this.fecha = fecha;
    }
    
    
        
    /* Metodo Constructor 
      
    
      Complejidad temporal: O(N)Tiempo Constante 
    */   
    public void vuelos(int NumVuelo,String destino,Date horasalida,Date fecha) {
        
    }
    
    
    
    // Getters and Setters
    
    public int getNumvuelo() {
        return numVuelo;
    }

    public void setNumvuelo(int numvuelo) {
        this.numVuelo = numvuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Date horasalida) {
        this.horasalida = horasalida;
    }

    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
    
}
