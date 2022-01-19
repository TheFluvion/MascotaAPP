
package Ejercicios.APP;

import Ejercicios.Entidades.Circunferencia;
import java.util.Scanner;

public class Ejercicio2APP {
    
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            
        
            Circunferencia c = new Circunferencia();
            
            c.radio = leer.nextDouble();
            
            double p = c.perimetro();
            
            double a = c.Area();
                    
            System.out.println("El perimetro es: " + p + " y el area es: " + a);
            
    
    
    
    
    
    
    
    
    
    }
    
    
    
}
