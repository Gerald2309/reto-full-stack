package co.com.sofka.crud.services;

import co.com.sofka.crud.entities.ListEntity;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.repositories.ListRepository;
import co.com.sofka.crud.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListService {
    @Autowired
    private ListRepository repository;

    public Iterable<ListEntity> list(){
        return this.repository.findAll();
    }

    public ListEntity save(ListEntity listEntity){
        return this.repository.save(listEntity);
    }

    public void delete(Integer id){
        this.repository.delete(get(id));
    }

    public ListEntity get(Integer id){
        return this.repository.findById(id).orElseThrow();
    }
}
