package ejerciciogestionreservas;

import java.util.Scanner;
import logica.PrecioReserva;
import logica.Reserva;

public class EjercicioGestionReservas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el precio orignal de la reserva: ");
        int precioOriginal = Integer.parseInt(sc.nextLine());

        System.out.println("Que tipo de reserva quiere realizar: 1: Membresia 2:Temporada Baja 3:Reserva ultima hora");
        int opcion = Integer.parseInt(sc.nextLine());

        //Alta 
        //descuento cliente membresia  10%
        PrecioReserva clienteMembresia = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioOriginal) {
                return precioOriginal - (precioOriginal * 0.10);
            }

        };

        //descuento clientes temporada baja 20%
        PrecioReserva clienteTemBaja = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioOriginal) {
                return precioOriginal - (precioOriginal * 0.20);
            }

        };

        //descuento precio fijo ultima hora
        PrecioReserva clienteFijo = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioOriginal) {
                return precioOriginal;
            }

        };

        Reserva reserva = new Reserva();

        reserva.realizarReserva(precioOriginal,clienteFijo);

    }

}
