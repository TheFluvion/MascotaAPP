
package Ejercicios.Entidades;


public class Rectangulo 
{
    private int altura;
    private int base;

    public Rectangulo() {
    }

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    
    public void Datos(int base, int altura){
        this.altura = altura;
        this.base = base;
    
    }
    
    
    public int Superficie(){
        int superficie = base * altura;
        return superficie;
    
    }
    
    public int Perimetro(){
        int perimetro = (base + altura)*2;
        return perimetro;
    }
    //rectangulo completo
     public void DibujarRectangulo() {
        System.out.println("");
        for (int i=0; i< altura; i++){
            for (int j=0; j< base; j++) {
                System.out.print("*"); 
            }
                System.out.println("");
            }       
       }

    /* Rectangulo con solo los bordes
    public void DibujarRectangulo2(){
                int i = 0;
		int j = 0;
		int n = 10;
		for (i=0; i<10;i++)
		{
			for (j=0; j<10;j++)
			{
				if ((i==0)||(i==2)||((i==1)&(j==0))||((i==1)&(j==(n-1))))
					System.out.print ("*");
				else
					System.out.print (" ");
			}
			System.out.println (" ");
		}
    
    
    }
    */
    

}
