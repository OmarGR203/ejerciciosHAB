
package ejemplotrycatch;


public class EjemploTryCatch {

    public static void main(String[] args) {
       
        int edades[] = new int[3];
        
        try{
        edades[2] = 15;
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("El numero ingresado no corresponde a un numero valido");
        }
        catch(NullPointerException e){
            System.out.println("Ha intentado accedar a una posicion nula");
        }
        finally{
            System.out.println("Hola soy el finally");
        }
    }
    
}
