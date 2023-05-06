package ec.com.empresa.jpa;

import ec.com.empresa.jpa.helper.AdapterOperations;
import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.model.libro.gateways.LibroRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Libro,LibroEntity, String, JPARepository>
 implements LibroRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Libro.class));
    }

    @Override
    public List<Libro> findByName(String name) {
        return null;
    }
}
