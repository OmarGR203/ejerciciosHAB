
package logica;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Inscripcion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    
    @OneToOne
    private Programador programador;
    
    @ManyToOne
    private Categoria categoria;

    public Inscripcion(Long id, String fecha, Programador programador, Categoria categoria) {
        this.id = id;
        this.fecha = fecha;
        this.programador = programador;
        this.categoria = categoria;
    }
    
    
    
}
