
package Ejercicios.APP;

import Ejercicios.Entidades.Carta;
import Ejercicios.Servicios.Baraja;


public class EjercicioBaraja {
    public static void main(String[] args){
        Baraja b = new Baraja();
        //b.mostrarBaraja();
        //System.out.println(b.cartasDisponibles());
        
        Carta[] c = b.darCartas(4);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    
    
    
    
    
    }
}
