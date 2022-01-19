package mascotapp;

import java.util.Scanner;
import mascotapp.Servicios.ServicioMascota;


public class MascotAPP {

 
    public static void main(String[] args) {
            
            ServicioMascota servMasc = new ServicioMascota();
            
            servMasc.fabricarMascotas(2);
            servMasc.mostrarMascota();
            servMasc.actualizarMascota(1);
            servMasc.mostrarMascota();
            servMasc.eliminarMascota(1);
        
        
        
        
    }
    
}
