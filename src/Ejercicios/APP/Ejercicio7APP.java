
package Ejercicios.APP;

import Ejercicios.Entidades.Persona;
import Ejercicios.Servicios.PersonaServicio;

public class Ejercicio7APP 
{
    
    public static void main(String[] args){
        PersonaServicio servicio = new PersonaServicio();
        //Persona p1 = servicio.crearPersona();
        
        
        Persona[] vectorPersonas = servicio.crearPersonas(4);
        
    
    }
    
    
}
