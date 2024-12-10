
package e4d1operacioneslectura;

import java.util.Scanner;


public class E4D1OperacionesLectura {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("SISTEMA OPERACIONES BÁSICAS");
        
        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        
        double suma = (num1 + num2);
        double resta = (num1 - num2);
        double multiplicacion = (num1 * num2);
        double division = (num1 / num2);
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        
        
        
    }
    
}
