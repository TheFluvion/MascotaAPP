
package Ejercicios.Entidades;


public class Operacion 
{
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int Sumar(){
               int sumar = numero1 + numero2;
               return sumar;    
    }
    
    public int Restar(){
               int restar = numero1 - numero2;
               return restar;    
    }
    
    public int Multiplicar(){
        if (numero1 == 0 || numero2 == 0){
            int multi = 0;
            System.out.println("Uno de los valores ingresados es igual a cero");
            return multi;
        }
        else {
            int multi = numero1*numero2;
            return multi;
        }        
    }
    
    public double Dividir(){
        if (numero1 == 0 || numero2 == 0){
            double div = 0;
            System.out.println("Uno de los valores ingresados es igual a cero");
            return div;
        }
        else {
            double div = numero1/numero2;
            return div;
        }
    
    
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

  
    
    public void CrearOperacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    
    }
    
    
    
    
    
    
    
    
    
    
}
