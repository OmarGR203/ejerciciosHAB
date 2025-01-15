
package logica;

public class Compra {
    
    String nTarjeta;
    double montoCompra;
    String nombre;

    public Compra() {
    }

    public Compra(String nTarjeta, double montoCompra, String nombre) {
        this.nTarjeta = nTarjeta;
        this.montoCompra = montoCompra;
        this.nombre = nombre;
    }

    public String getnTarjeta() {
        return nTarjeta;
    }

    public void setnTarjeta(String nTarjeta) {
        this.nTarjeta = nTarjeta;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Compra{" + "nTarjeta=" + nTarjeta + ", montoCompra=" + montoCompra + ", nombre=" + nombre + '}';
    }
    
    
    
}
