package co.com.sofka.crud.mappers;

import co.com.sofka.crud.dtos.TodoDTO;
import co.com.sofka.crud.entities.Todo;

public class TodoMapper {
    public static TodoDTO toDTO(Todo todoEntity){
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setId(todoEntity.getId());
        todoDTO.setLabel(todoEntity.getLabel());
        todoDTO.setCompleted(todoEntity.getIsCompleted());
        todoDTO.setListId(todoEntity.getListId());
        return todoDTO;

    }

    public static Todo toEntity(TodoDTO todoDTO){
        Todo todoEntity = new Todo();
        todoEntity.setId(todoDTO.getId());
        todoEntity.setLabel(todoDTO.getLabel());
        todoEntity.setIsCompleted(todoDTO.getCompleted());
        todoEntity.setListId(todoDTO.getListId());
        return todoEntity;
    }
}
