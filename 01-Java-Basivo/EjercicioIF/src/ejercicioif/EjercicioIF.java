
package ejercicioif;

import java.util.Scanner;


public class EjercicioIF {

    public static void main(String[] args) {
 
       int pesoPermitido=100;
       int peso;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("SISTEMA LÍMITE DE PESO");
       System.out.println("Ingresa tu peso en kg:");
       peso = sc.nextInt();
        
       
       if(peso<=pesoPermitido){
           System.out.println("Puede subir a la atracción.");
       }
       else{
       int pesoExcedido = peso-pesoPermitido;
           System.out.println("Lo siento, supera el peso permitido por "+ pesoExcedido +" kg." );
       }
       
        System.out.println("Gracias por usar el sistema :D");
       
    }
    
}
