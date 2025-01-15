package ejercicio1excepcion;

import java.util.Scanner;
import logica.Compra;
import logica.MontoInvalidoException;

public class Ejercicio1Excepcion {

    public static void main(String[] args) throws MontoInvalidoException {

        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();

        try {
            System.out.println("Ingrese el numero de la tarjeta:");
            compra.setnTarjeta(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese solo numeros");
        }

     
        try {
            System.out.println("Ingrese su nombre:");
            compra.setNombre(sc.nextLine());
            
            if(){
                
            }
        } catch (IllegalArgumentException e) {
            System.out.println("El nombre ingresado no debe quedar en blanco");
        }

     
        System.out.println("Ingrese el monto de la compra");
        sc = new Scanner(System.in);
        compra.setMontoCompra(sc.nextDouble());

        System.out.println(compra.toString());
        try {
            compra.setMontoCompra(sc.nextDouble());
        } catch (MontoInvalidoException e) {
            System.out.println("Ingreso un dato no valido");

        }

    }

}
