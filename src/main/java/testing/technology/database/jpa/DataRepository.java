package testing.technology.database.jpa;

import org.springframework.data.repository.CrudRepository;
import testing.technology.database.entity.Data;

public interface DataRepository extends CrudRepository<Data, Integer> {
}
