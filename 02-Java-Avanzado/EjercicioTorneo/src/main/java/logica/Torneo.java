package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.OneToMany;

@Entity
public class Torneo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany
    private List<Categoria> listaCategorias;

    public Torneo(Long id, String nombre, List<Categoria> listaCategorias) {
        this.id = id;
        this.nombre = nombre;
        this.listaCategorias = listaCategorias;
    }

}
