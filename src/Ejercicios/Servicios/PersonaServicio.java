
package Ejercicios.Servicios;

import Ejercicios.Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio 
{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo: Hombre(H) - Mujer (M) - Otro (O)");
        char sexo = Character.toUpperCase(leer.next().charAt(0));
        System.out.println("Ingrese su peso: (en kg)");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = leer.nextDouble();
        
        while(sexo != 'H' && sexo != 'M' && sexo != 'O'){
            System.out.println("Ingrese un sexo valido");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }
        while (peso < 1){
            System.out.println("Ingrese un peso valido:");
            peso = leer.nextDouble();
        }
        return new Persona(nombre, edad, sexo, peso, altura);
        
    }
    
    
    // peso/ (Math.pow(altura,2)
    public int calcularIMC(Persona p)
    {
        double altura = p.getAltura();
        double peso = p.getPeso();
        double imc = peso/(Math.pow(altura,2));
        
        if (imc<20)     {
            return IMC_BAJO;
        }
        else if (imc>25){
            return IMC_ALTO;
        }
        else            {
            return IMC_IDEAL;
        }
    }
    
    //metodo esMayorDeEdad: indica si la persona es mayor de edad.
    public boolean esMayorDeEdad(Persona p){
        /*boolean mayor = p.getEdad() >= 18;
        return mayor;*/
        return p.getEdad() >= 18;
    }
    
    public Persona[] crearPersonas(int cant){
        Persona[] personas = new Persona[cant];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = crearPersona();
        }
        return personas;
    }
    
    public void porcentajePeso(Persona[] personas){
        int contadorAlto = 0;
        int contadorBajo = 0;
        int contadorIdeal = 0;
        int cantidadPersonas = personas.length;
        //FOR EACH (para cada)
        for (Persona persona : personas) 
        {
            switch(calcularIMC(persona))
            {
                case -1:
                    System.out.println(persona.getNombre() + " esta por debajo de su peso ideal");
                    contadorBajo++;
                    break;
                
                case 0:
                    System.out.println(persona.getNombre() + " esta en su peso ideal");
                    contadorIdeal++;
                    break;
                    
                case 1:
                    System.out.println(persona.getNombre() + " esta por encima de su peso ideal");
                    contadorAlto++;
                    break;
            
            }
        }
        
        System.out.println("Hay " + ((contadorBajo*100)/cantidadPersonas) + "% de personas por debajo de su peso ideal");
        System.out.println("Hay " + ((contadorIdeal*100)/cantidadPersonas) + "% de personas en su peso ideal");
        System.out.println("Hay " + ((contadorAlto*100)/cantidadPersonas) + "% de personas por encima de su peso ideal");
    }
    
    
    public void porcentajeEdad(Persona[] personas){
        int cantidadPersonas = personas.length;
        int contadorMayor = 0;
        
        for (Persona persona : personas) {
            if (esMayorDeEdad(persona)){
                contadorMayor++;
                System.out.println(persona.getNombre() + " es mayor de edad");
            }
        }
        System.out.println("Hay " + ((contadorMayor*100)/cantidadPersonas) + "% de mayores de edad");
        System.out.println("Hay " + ((cantidadPersonas - contadorMayor)*100) + "% de menores de edad" );
    }  
}
