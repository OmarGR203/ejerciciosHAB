
package logica;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    
    @ManyToOne
    private Torneo torneo;
    
    @OneToMany
    private List<Inscripcion> listaInscripciones;

    public Categoria(Long id, String nombre, Torneo torneo, List<Inscripcion> listaInscripciones) {
        this.id = id;
        this.nombre = nombre;
        this.torneo = torneo;
        this.listaInscripciones = listaInscripciones;
    }
    
    
    
}
