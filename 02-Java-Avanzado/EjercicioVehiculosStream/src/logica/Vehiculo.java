
package logica;

public class Vehiculo {
    private String marca;
    private String modelo; 
    private double costo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double costo) {
        this.modelo = marca;
        this.marca = modelo;
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", marca=" + marca + ", costo=" + costo + '}';
    }
    
    
}
