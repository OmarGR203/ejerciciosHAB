package logica;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Programador {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long id;
    private String nombre;
    private String apellido;
    private String nivelAcademico;
    
    private Categoria categoria;

    public Programador(Long id, String nombre, String apellido, String nivelAcademico, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelAcademico = nivelAcademico;
        this.categoria = categoria;
    }

}
