
package logica;

public class Carro {
    
    private Long numMotor;
    private String modelo;
    private String marca;
    private Propietario unPropietario;

    public Carro() {
    }

    public Carro(Long numMotor, String modelo, String marca, Propietario unPropietario) {
        this.numMotor = numMotor;
        this.modelo = modelo;
        this.marca = marca;
        this.unPropietario = unPropietario;
    }

    public Long getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(Long numMotor) {
        this.numMotor = numMotor;
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

    public Propietario getUnPropietario() {
        return unPropietario;
    }

    public void setUnPropietario(Propietario unPropietario) {
        this.unPropietario = unPropietario;
    }
    
    
}
