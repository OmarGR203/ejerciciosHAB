
package logica;

public class Reserva<T,U> {
    
     private T vehiculo;
    private double duracion;
    private U metodoReserva;

    public Reserva() {
    }

    public Reserva(T vehiculo, double duracion, U metodoReserva) {
        this.vehiculo = vehiculo;
        this.duracion = duracion;
        this.metodoReserva = metodoReserva;
    }

    public T getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(T vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public U getMetodoReserva() {
        return metodoReserva;
    }

    public void setMetodoReserva(U metodoReserva) {
        this.metodoReserva = metodoReserva;
    }

    public void procesarReserva() {
        System.out.println("Se procesa la reserva de: " + duracion + " horas del vehiculo: " + 
                          vehiculo.toString() + " en medio de reserva: " + metodoReserva.toString());
}
}
