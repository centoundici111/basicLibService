package ec.com.empresa.jpa;

import ec.com.empresa.jpa.helper.AdapterOperations;
import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.model.libro.gateways.LibroRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Libro, LibroEntity, String, JPARepository>
        implements LibroRepository {

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        //se puede utilizar pero obliga a que el modelo sea una clase y no un record y tenga
        //@Getter
        //@Setter
        //y que los nombres de los atributos hagan match de manera exacta con la entidad JPA
        // super(repository, mapper, d -> mapper.mapBuilder(d,Libro.LibroBuilder.class).build());

        //este es el mapeo manual y si se puede usar un record
        super(repository, mapper, libroE -> Libro.builder().ISBN(libroE.getISBN())
                .nombreDelLibro(libroE.getNombre())
                .descripcion(libroE.getDescripcion()).build());
    }

    @Override
    public List<Libro> findByName(String name) {
        return null;
    }

    @Override
    public Libro createBook(Libro libro) {
        LibroEntity mapToEntity = LibroEntity.builder().ISBN(libro.ISBN()).nombre(libro.nombreDelLibro()).build();
        this.saveData(List.of(mapToEntity));
        return libro;
    }
}
