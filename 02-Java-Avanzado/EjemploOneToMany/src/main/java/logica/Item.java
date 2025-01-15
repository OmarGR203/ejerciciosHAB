
package logica;


public class Item {
    
    private Long id;
    private String nombreItem;
    
    private Carrito carrito;

    public Item() {
    }

    public Item(Long id, String nombreItem, Carrito carrito) {
        this.id = id;
        this.nombreItem = nombreItem;
        this.carrito = carrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
}
