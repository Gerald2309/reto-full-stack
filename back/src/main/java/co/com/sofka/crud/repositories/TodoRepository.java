package co.com.sofka.crud.repositories;

import co.com.sofka.crud.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, String> {
     Iterable<Todo> findByListId(String listId);
}
