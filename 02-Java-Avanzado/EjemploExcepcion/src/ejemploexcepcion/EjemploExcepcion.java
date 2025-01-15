
package ejemploexcepcion;

import java.util.Scanner;
import logica.ExcepcionDatoIncorrecto;


public class EjemploExcepcion {

 
    public static void main(String[] args) throws ExcepcionDatoIncorrecto {
      
        int dato;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un dato entre 1 y 10");
        
        dato = sc.nextInt();
        if(dato<=0 || dato >= 11 ){
            throw new ExcepcionDatoIncorrecto("Ingreso un dato no valido");
        }
    
    
    }
    
}
