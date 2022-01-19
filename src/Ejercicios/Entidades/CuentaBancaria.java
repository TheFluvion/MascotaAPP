
package Ejercicios.Entidades;

import java.util.logging.Logger;


public class CuentaBancaria 
{
    private long numeroCuenta;
    private long dni;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }
    

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public void CrearCuenta(long dni){
            this.dni = dni;
            this.numeroCuenta = (long) (Math.random()*200000);
    
    }
    
    public void IngresarDinero(double ingreso){
            saldo+=ingreso;
    
    }
    
    public void RetirarDinero(double retiro){
        if (retiro>saldo){
            System.out.println("El valor ingresado es superior");
        
        }
        else {
            saldo-=retiro;
            System.out.println("Su saldo es:" + saldo);
        }
    }
    
    public void ExtraccionRapida(double rapido){
        double porcentaje =  (20*saldo)/100;
            if (porcentaje==rapido){
                saldo-=porcentaje;
                System.out.println("Su saldo es: " + saldo);
            }
            else{
                System.out.println("El valor ingresado es incorrecto");
            }
    }
    
    public void ConsultarSaldo(){
            System.out.println("Su saldo es: " + saldo);
            System.out.println("");
    }
    
    public void ConsutarDatos(){
            System.out.println("DNI: " + dni);
            System.out.println("Numero de cuenta: " +numeroCuenta);
            System.out.println("");
    }
    
    
    
    
}
