
package ejercicioer2;

import java.util.Scanner;


public class EjercicioER2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();
       
        for(int i=0;  i<10; i++){
            int suma = numero * i;
            System.out.println("El numero " + numero + " multiplicado por "+ i +" es igual a "+ suma);
        }
    }
    
}
