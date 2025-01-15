
package logica;


public class Reserva {
        public void realizarReserva (double precioOriginal, PrecioReserva precioR) {
        double precioFinal = precioR.calcularPrecio(precioOriginal);
        System.out.println("El precio final de sus reserva es: " + precioFinal);
    }
}
