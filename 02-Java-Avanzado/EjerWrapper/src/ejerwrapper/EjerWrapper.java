package ejerwrapper;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Animal;

public class EjerWrapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        boolean bandera = true;

        Animal animal = new Animal();
        do  {
            System.out.println("Ingreso el nombre del animal: ");
            animal.setNombre(sc.nextLine());

            System.out.println("Ingresa el peso: ");
            sc = new Scanner(System.in);
            animal.setPeso(sc.nextDouble());

            animales.add(animal);
            animal = new Animal();
        }
        while(bandera != true);{
         if (animal.getNombre().equalsIgnoreCase("fin")) {
                bandera = true;
            }
    }

        for (Animal ani : animales) {
            System.out.println(ani.toString());
        }

    }

}
