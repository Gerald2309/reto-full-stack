package co.com.sofka.crud.controllers;

import co.com.sofka.crud.dtos.ListDTO;
import co.com.sofka.crud.entities.ListEntity;
import co.com.sofka.crud.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/${config.project.version}")
@CrossOrigin(origins = "${config.cross.origin}")
public class ListController {

    @Autowired
    private ListService service;

    @GetMapping(value = "/listToDo")
    public Iterable<ListDTO> list(){
        return this.service.list();
    }

    @PostMapping(value = "/listToDo")
    public ListEntity save(@RequestBody ListEntity listEntity){
        return this.service.save(listEntity);
    }

    @DeleteMapping(value = "/listToDo/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
    }
}