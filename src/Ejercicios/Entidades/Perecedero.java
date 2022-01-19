/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Entidades;

/**
 *
 * @author Gaston
 */
public class Perecedero extends Producto {
    
    private int diasAcaducar;

    public Perecedero(int diasAcaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasAcaducar = diasAcaducar;
    }

    public int getDiasAcaducar() {
        return diasAcaducar;
    }

    public void setDiasAcaducar(int diasAcaducar) {
        this.diasAcaducar = diasAcaducar;
    }

    @Override
    public String toString() {
        return "diasAcaducar = " + diasAcaducar;
    }
    
    
    
    
}
