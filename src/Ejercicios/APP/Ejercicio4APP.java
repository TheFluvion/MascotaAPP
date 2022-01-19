
package Ejercicios.APP;

import Ejercicios.Entidades.Rectangulo;
import java.util.Scanner;


public class Ejercicio4APP {
    
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            Rectangulo r = new Rectangulo();
            System.out.println("Ingrese la base y la altura");
            int base = leer.nextInt();
            int altura = leer.nextInt();
            r.Datos(base, altura);
            System.out.println("La superficie es: " + r.Superficie());
            System.out.println("El perimetro es: " + r.Perimetro());
            
            r.DibujarRectangulo();
            
    
    
    
    }
    
    
    
}
