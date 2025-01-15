package ejerciciovehiculosstream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import logica.Vehiculo;

public class EjercicioVehiculosStream {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota", "Fortuna", 3000));
        vehiculos.add(new Vehiculo("Renault", "Logan", 950));

        //01 Listar vehiculos por costo de menor a mayor
        List<Vehiculo> ordenarCosto = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .collect(Collectors.toList());

        System.out.println("Vehiculos ordenados por costo:");
        ordenarCosto.forEach(System.out::println);
        
        System.out.println("-------------------------------------------------------------");

        //02 Listar ordenadados por marca y por precio
        List<Vehiculo> ordMarcaCosto = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparing(Vehiculo::getCosto))
                .collect(Collectors.toList());

        System.out.println("Vehiculos ordenados por marca y costo:");
        ordMarcaCosto.forEach(System.out::println);
        
        System.out.println("-------------------------------------------------------------");

        // 03 Costo menor a 1000
        List<Vehiculo> vehiculoMenor1000 = vehiculos.stream()
                .filter(carro -> carro.getCosto() < 1000)
                .collect(Collectors.toList());

        System.out.println("Vehiculos con costo menor a 1000:");
        vehiculoMenor1000.forEach(System.out::println);
        
        System.out.println("-------------------------------------------------------------");

        //04 Costo igual o mayor a 1000
        List<Vehiculo> vehiculoMayor1000 = vehiculos.stream()
                .filter(carro -> carro.getCosto() >= 1000)
                .collect(Collectors.toList());

        System.out.println("Vehiculos con costo igual o mayor a 1000");
        vehiculoMayor1000.forEach(System.out::println);
        
        System.out.println("-------------------------------------------------------------");

        //05 Promedio de los costos
        double promedioCostos = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0);

        System.out.println("El promedio de costos es: " + promedioCostos);
        
        System.out.println("-------------------------------------------------------------");

        //06 Autos de la marca chevrolet y siat
        List<Vehiculo> marcaCheSiat = vehiculos.stream()
                .filter(carro -> carro.getMarca().equalsIgnoreCase("Chevrolet")
                || carro.getMarca().equalsIgnoreCase("Siat"))
                .collect(Collectors.toList());

        System.out.println("Vehiculos de marca Chevrolet y Siat:");
        marcaCheSiat.forEach(System.out::println);

        System.out.println("-------------------------------------------------------------");

        //modelos con una letra c
        List<Vehiculo> modelosC = vehiculos.stream()
                .filter(carro -> carro.getModelo().toLowerCase().contains("c"))
                .collect(Collectors.toList());

        System.out.println("Vehiculos que en su modelo contiene la letra : 'c'");
        modelosC.forEach(System.out::println);
    }

}
