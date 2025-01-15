
package ejerreservavehiculos;

import logica.Reserva;

public class EjerReservaVehiculos {

    public static void main(String[] args) {
                Reserva<Auto, Presencial> reservaAutoPresencial = new Reserva<>(new Auto(4), 2.5, new Presencial());
        Reserva<Moto, Online> reservaMotoOnline = new Reserva<>(new Moto(), 1.0, new Online());
        Reserva<Bicicleta, Online> reservaBiciElectrica = new Reserva<>(new Bicicleta(true), 3.0, new Online());
       
        reservaAutoPresencial.procesarReserva();
        reservaMotoOnline.procesarReserva();
        reservaBiciElectrica.procesarReserva();
      
    }
    
}
