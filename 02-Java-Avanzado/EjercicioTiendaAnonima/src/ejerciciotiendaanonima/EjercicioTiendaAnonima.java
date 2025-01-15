
package ejerciciotiendaanonima;

import logica.Descuento;
import logica.Producto;

public class EjercicioTiendaAnonima {

    public static void main(String[] args) {
        
        double precioOriginal = 350.0;
        //CReoo una instancia de la clase producto
        Producto producto = new Producto();
        
        //Clase anonima para el nuevo cliente 5% de descuento

        
        
        
        
        
        //Clase anonima para el  cliente frecuente 10% de descuento
        
         new Descuento(){
             @Override
             public double aplicarDescuento(double precioOriginal) {
                return precioOriginal-(precioOriginal*0.10);
             }
             
         };
        
        
        
        
        //Clase anonima para el nuevo cliente 20% de descuento
                 new Descuento(){
             @Override
             public double aplicarDescuento(double precioOriginal) {
                return precioOriginal-(precioOriginal*0.20);
             }
             
         };
    
    
    
    
    
    
    }
    
}
