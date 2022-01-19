
package Ejercicios.APP;

import Ejercicios.Entidades.CuentaBancaria;
import java.util.Scanner;


public class Ejercicio5APP 
{
    public static void main(String[] args){
            int t = 0;
            int o;
            CuentaBancaria c = new CuentaBancaria();
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su dni para generar una cuenta");
            c.CrearCuenta(leer.nextLong());
            do{
                System.out.println("Que operacion desea realizar?");
                System.out.println("1) Ingresar dinero");
                System.out.println("2) Retirar dinero");
                System.out.println("3) Extraccion rapida (solo 20% de su saldo)");
                System.out.println("4) Consultar saldo");
                System.out.println("5) Consultar datos de la cuenta");
                System.out.println("6) Salir");
                o = leer.nextInt();
            switch(o){
                case 1:
                    double ingreso = leer.nextDouble();
                    c.IngresarDinero(ingreso);
                    continue;
                    
                case 2:
                    double retiro = leer.nextDouble();
                    c.RetirarDinero(retiro);
                    continue;
                    
                case 3:
                    double rapido = leer.nextDouble();
                    c.ExtraccionRapida(rapido);
                    continue;
                    
                case 4:
                    c.ConsultarSaldo();
                    continue;
                    
                case 5:
                    c.ConsutarDatos();
                    
                case 6:
                    break;
                    }
            }while (o!=6);

    }
}
