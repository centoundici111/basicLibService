package ec.com.empresa.model.libro.gateways;

import ec.com.empresa.model.libro.Libro;

import java.util.List;

public interface LibroRepository {
    public List<Libro> findByName(String name);

    public Libro findById(String id);
}
