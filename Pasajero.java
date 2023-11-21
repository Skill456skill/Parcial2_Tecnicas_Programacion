package javaapplication18;

import java.util.LinkedList;

public class Pasajero{

      
    // Atributos 
   LinkedList <Vuelo> VuelosDisponibles = new LinkedList<Vuelo>();
   private String nombre;
    private int numPasaporte;
    private int edad;
    private String PreferAlimenticias;


    /* Metodo Constructor 
      
    
      Complejidad temporal: O(N)Tiempo Constante 
    */    
    public Pasajero(String nombre, int numPasaporte, int edad, String PreferAlimenticias) {
        this.nombre = nombre;
        this.numPasaporte = numPasaporte;
        this.edad = edad;
        this.PreferAlimenticias = PreferAlimenticias;
    }

    
    public void Reserva(Vuelo vuelo) {
        VuelosDisponibles.add(vuelo);
        
    }

    public LinkedList<Vuelo> getVuelosDisponibles() {
        return VuelosDisponibles;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPreferAlimenticias() {
        return PreferAlimenticias;
    }

    public void setPreferAlimenticias(String PreferAlimenticias) {
        this.PreferAlimenticias = PreferAlimenticias;
    }
    
}
