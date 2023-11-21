
package javaapplication18;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        // Atributos 
        Scanner sc = new Scanner(System.in);        
        Pasajero pasajero = new Pasajero("asdsad", 12345, 14, "Manzana");
        Vuelo vuelo1 =  new Vuelo(26, );
    
    
    
    System.out.println("1. Reservar un vuelo");
    System.out.println("2. Vuelos Disponibles");
    System.out.println("3. Salir");
    int opcion =  sc.nextInt();
    
        switch (opcion ) {
            case 1:
                
                break;
            case 2:
                System.out.println("Vuelos Disponibles " + Vuelo.get);
            case 3:
                System.out.println(" Gracias por usar nuestros servicios");
                break;
            default:
                throw new AssertionError();
        }
        
        
        
    }
    
}
