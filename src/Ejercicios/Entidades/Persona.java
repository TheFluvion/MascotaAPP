
package Ejercicios.Entidades;


public class Persona 
{
    
    private String nombre;
    private Integer edad;
    private Character sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre: " + nombre + ", edad: " + edad + ", sexo: " + sexo + ", peso: " + peso + ", altura: " + altura + "";
    }

 
    
    
    
    
    
    
    
    
    
}
