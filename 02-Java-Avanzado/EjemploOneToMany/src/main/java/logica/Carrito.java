
package logica;

import java.util.List;


public class Carrito {
    private Long id;
    
    private List<Item> listaItems;

    public Carrito() {
    }

    public Carrito(Long id, List<Item> listaItems) {
        this.id = id;
        this.listaItems = listaItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }
    
    
    
    
}
