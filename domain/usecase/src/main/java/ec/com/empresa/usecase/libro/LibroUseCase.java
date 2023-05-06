package ec.com.empresa.usecase.libro;

import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.model.libro.gateways.LibroRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class LibroUseCase {
    private final LibroRepository libroRepository;
    private final List<Libro> findByName(String name) {
        return libroRepository.findByName(name);
    }

    public final Libro findById(String id){
        return libroRepository.findById(id);
    }
}
