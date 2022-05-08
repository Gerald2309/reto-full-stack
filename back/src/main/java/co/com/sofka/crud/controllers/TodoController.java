package co.com.sofka.crud.controllers;

import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/${config.project.version}")
@CrossOrigin(origins = "${config.cross.origin}")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping(value = "/todo")
    public Todo save(@RequestBody Todo todo){
        return this.service.save(todo);
    }

    @PutMapping(value = "/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != null){
            return this.service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "/todo/{id}")
    public void delete(@PathVariable("id")String id){
        this.service.delete(id);
    }


}
