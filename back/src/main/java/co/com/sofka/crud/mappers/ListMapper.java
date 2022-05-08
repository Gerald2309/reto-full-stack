package co.com.sofka.crud.mappers;

import co.com.sofka.crud.dtos.ListDTO;
import co.com.sofka.crud.dtos.TodoDTO;
import co.com.sofka.crud.entities.ListEntity;
import co.com.sofka.crud.entities.Todo;

import java.util.ArrayList;
import java.util.List;

public class ListMapper {
    public static ListDTO toDTO(ListEntity listEntity, Iterable<Todo> todoEntities){
        ListDTO listDTO = new ListDTO();
        List<TodoDTO> todoDTOS = new ArrayList<>();
        todoEntities.forEach(todoEntity -> {
            todoDTOS.add(TodoMapper.toDTO(todoEntity));
        });

        listDTO.setId(listEntity.getId());
        listDTO.setLabel(listEntity.getLabel());
        listDTO.setTodoDTOS(todoDTOS);

        return listDTO;
    }


    public static ListEntity toEntity(ListDTO listDTO){
        ListEntity listEntity = new ListEntity();
        listEntity.setId(listDTO.getId());
        listEntity.setLabel(listDTO.getLabel());


        return listEntity;
    }
}
