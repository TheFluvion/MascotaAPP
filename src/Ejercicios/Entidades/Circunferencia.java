
package Ejercicios.Entidades;

import java.util.Scanner;


public class Circunferencia {
        Scanner leer = new Scanner(System.in);
        public double radio;
        public double area;
        public double perimetro;

    public Circunferencia() {
        
    }

    

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    public double perimetro(){
            perimetro = 2 * Math.PI * radio;
            return perimetro;
    
    }
    
     public double Area(){
                double area = Math.PI * Math.pow(radio, 2);
                return area;
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
