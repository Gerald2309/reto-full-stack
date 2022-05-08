package co.com.sofka.crud.services;

import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> list(){
        return repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Integer id){
        repository.delete(get(id));
    }

    public Todo get(Integer id){
         return repository.findById(id).orElseThrow();
    }

}
