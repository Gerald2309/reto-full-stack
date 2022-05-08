package co.com.sofka.crud.services;

import co.com.sofka.crud.dtos.ListDTO;
import co.com.sofka.crud.entities.ListEntity;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.mappers.ListMapper;
import co.com.sofka.crud.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListService {
    @Autowired
    private ListRepository repository;

    @Autowired
    private TodoService todoService;

    public Iterable<ListDTO> list() {
        List<ListDTO> listDTOS = new ArrayList<>();

        this.repository.findAll().forEach(listEntity -> {
            Iterable<Todo> todoEntities = todoService.getByListId(listEntity.getId());
            listDTOS.add(ListMapper.toDTO(listEntity, todoEntities));
        });

        return listDTOS;
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
