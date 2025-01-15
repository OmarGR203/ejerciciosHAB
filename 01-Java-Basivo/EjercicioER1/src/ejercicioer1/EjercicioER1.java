
package ejercicioer1;

import java.util.Scanner;

public class EjercicioER1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("SISTEMA SUMA DE NÚMEROS");
        System.out.println("Ingresa un número a sumar: ");
        float numero = sc.nextInt();
        
        if(numero<=0){
        while(numero>0){
            System.out.println("Ingresa otro número a sumar");
            float suma = numero += numero;
            numero ++;
        }
         System.out.println("La suma de los número es" + suma);
        }
        
       
    }
    
}
