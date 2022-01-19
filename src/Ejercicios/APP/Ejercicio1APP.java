
package Ejercicios.APP;

import Ejercicios.Entidades.Libro;
import java.util.Scanner;


public class Ejercicio1APP {
    
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
         System.out.println("Ingrese los datos del libro en el siguiente orden:");
         System.out.println("Hojas - ISBN - autor - titulo");
         Libro libro = new Libro();
         
         libro.hojas = leer.nextInt();
         libro.ISBN = leer.nextInt();
         libro.autor = leer.next();
         libro.titulo = leer.next();
         
         
         System.out.println("Titulo: " + libro.titulo + ", Autor: " + libro.autor + ", Numero de hojas: " + libro.hojas + ", ISBN: " + libro.ISBN);
         

    
    
    }   
}
