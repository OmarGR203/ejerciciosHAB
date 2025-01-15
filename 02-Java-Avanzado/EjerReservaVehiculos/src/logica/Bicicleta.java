
package logica;


public class Bicicleta {
        private boolean esElectrica;

    public Bicicleta(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    @Override
    public String toString() {
        return "Bicicleta " + (esElectrica ? "eléctrica" : "manual");
    }
    
}
