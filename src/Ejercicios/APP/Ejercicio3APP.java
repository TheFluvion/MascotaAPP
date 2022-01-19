
package Ejercicios.APP;

import Ejercicios.Entidades.Operacion;
import java.util.Scanner;


public class Ejercicio3APP {
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            Operacion o = new Operacion();

            System.out.println("Ingrese los 2 valores");
            int first = leer.nextInt();
            int second = leer.nextInt();
            
            o.CrearOperacion(first, second);
            System.out.println("La suma es: "+ o.Sumar());
            System.out.println("La resta es: "+ o.Restar());
            System.out.println("La division es: "+ o.Dividir());
            System.out.println("La multiplicacion es: "+ o.Multiplicar());
            

    
    }
    
    
    
    
    
}
