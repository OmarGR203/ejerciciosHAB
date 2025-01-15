
package ejercicioarray2;

import java.util.Scanner;

public class EjercicioArray2 {

    public static void main(String[] args) {
      int calif [][] = new int[4][4];
      
        System.out.println("Ingresa los primedios");
              
        Scanner sc = new Scanner(System.in);
       for(int f=0;f<calif.length;f++){
           for(int c=0;c<(calif[1].length);c++){
               System.out.println("Ingrese el valor para la fila "+f+"columna"+c);
              calif[f][c] = sc.nextInt();
           }
           }
      
    }
    
}
