/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author oguzm
 */
public class ControladoraPersistencia {

    ProductoJpaController productoJpa = new ProductoJpaController();

    public void crearProducto(Producto producto) {
        productoJpa.create(producto);
    }
    public void borrarProducto(String id){
        try {
            productoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public void traerProducto(String id){
        productoJpa.findProducto(id);
    }
    
    public List<Producto> traerProductos(){
        return productoJpa.findProductoEntities();
        
    }
    
    
    public void editarProducto(Producto producto){
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
