
package mascotapp.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.mascotas = new ArrayList();
        
    }

    
    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        }
    
    public void mostrarMascota(){
        System.out.println("Las mascotas actuales de la lista son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    
    public void fabricarMascotas(int cantidad){
        for (int i = 0; i < cantidad; i++) {
           Mascota creada = crearMascota();
           agregarMascota(creada);
            System.out.println(creada); 
        }
    }
    // Hacer Añadir try and catch
    //public void actualizarMascota(int index){
       // Mascota m = mascotas.get(index);
        //m.setApodo("Fulano");}
    
    public void actualizarMascota(int index){
        if (index<= (mascotas.size() - 1)) {
            Mascota m = crearMascota();
        
            mascotas.set(index, m);
        }
        else{
            System.out.println("El indice es erroneo");
        }
    }
    
    public void eliminarMascota(int index){
        if (index<= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } 
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if(m.getNombre().equals(nombre)){
                mascotas.remove(i);
            }
        }
    }
    
}
