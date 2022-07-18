package testing.technology.database.jpa;

import org.springframework.data.repository.CrudRepository;
import testing.technology.database.entity.Simple;

public interface SimpleRepository extends CrudRepository<Simple, Integer> {
}
