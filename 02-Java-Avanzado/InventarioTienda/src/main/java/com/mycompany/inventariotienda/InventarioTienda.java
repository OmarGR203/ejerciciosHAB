
package com.mycompany.inventariotienda;

import logica.Producto;
import persistencia.ControladoraPersistencia;
import persistencia.ProductoJpaController;

public class InventarioTienda {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        controlPersis.crearProducto(new Producto("1", "Omar", 85.5, 12));
        controlPersis.crearProducto(new Producto("2", "Maria", 25.5, 14));
        
        
        
        
        
        
        

        
     
    }
}
