
package Ejercicios.Servicios;

import Ejercicios.Entidades.Carta;


public class Baraja {
    
         private Carta cartas[];
        private int posSiguientecarta;
    
        public static final int numCartas=40;
    
        public Baraja(){
            this.cartas=new Carta[numCartas];
            this.posSiguientecarta = 0;
            crearBaraja();
            barajar();
    }
    
        private void crearBaraja(){
            String[] palos = Carta.palos;
            
            for (int i = 0; i < palos.length; i++) {
                
                for (int j = 0; j < Carta.limCartas; j++) {
                    
                
                if ( ! (j==7 || j==8)){
                    if(j>=9){
                        cartas[((i * (Carta.limCartas - 2)) + (j-2) )] = new Carta(j+1, palos[i]);
                    
                    }else
                        cartas[((i * (Carta.limCartas - 2)) + j )] = new Carta(j+1, palos[i]);
                
                }
               }
            }
        
        }
    
    
        public void barajar(){
       
            int posAleatoria = 0;
            Carta c;
            
            for (int i = 0; i < cartas.length; i++) {
                posAleatoria = (int) (Math.random()*numCartas-1);
                
                c = cartas[i];
                cartas[i] = cartas[posAleatoria];
                cartas[posAleatoria] = c;
            }
            
            
        }
    
        public Carta siguientecarta(){
        
            Carta c = null;
            if(posSiguientecarta == numCartas){
                System.out.println("Ya no quedan cartas, baraja de nuevo");
            
            
            }else{
                c = cartas[posSiguientecarta];
                posSiguientecarta++;
            }
            
            
            return c;
        }
    
        public Carta[] darCartas(int numCarta){
            
            if (numCarta> numCartas){
                System.out.println("No se puede dar mas cartas de las que hay");
                return null;
            }else{
                
                if(cartasDisponibles() < numCartas){
                    System.out.println("No hay suficientes cartas");
                
                }else{
                    Carta[] cartasDar = new Carta [numCartas];
                    
                    for(int i=0;i<cartasDar.length;i++){
                        cartasDar[i] = siguientecarta();
                    }
                    return cartasDar;
                }
            }   
                return null;
        }
        
        
        public int cartasDisponibles(){
            return numCartas - posSiguientecarta;
        }
        
        public void cartasMonton(){
            
            if (cartasDisponibles() ==numCartas) {
                System.out.println("No se retiro ninguna carta");
            }else{
                for (int i = 0; i < posSiguientecarta; i++) {
                    System.out.println(cartas[i]);
                }
            
            }
            
            
        }
        
        public void mostrarBaraja(){
            if (cartasDisponibles() == 0) {
                System.out.println("No quedan cartas disponibles");
            }else{
                for (int i = posSiguientecarta; i <cartas.length ; i++) {
                    System.out.println(cartas[i]);
                }
            
            }
            
        }
}


