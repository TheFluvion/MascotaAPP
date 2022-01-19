
package Ejercicios.Entidades;


public class Carta {
    private int numero;
    private String palo;
    
    public static final String[] palos = {"Espada", "Oro", "Basto", "Copa"};
    public static final int limCartas = 12;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
    
    
    
}
