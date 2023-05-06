package ec.com.empresa.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class LibroEntity {
    @Id
    private String ISBN;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column
    private String descripcion;
}
