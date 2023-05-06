package ec.com.empresa.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<LibroEntity, String>, QueryByExampleExecutor<LibroEntity> {
}
