package co.com.sofka.crud.dtos;

import java.util.List;

public class ListDTO {
    private String id;
    private String label;
    private List<TodoDTO> todoDTOS;

    public ListDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<TodoDTO> getTodoDTOS() {
        return todoDTOS;
    }

    public void setTodoDTOS(List<TodoDTO> todoDTOS) {
        this.todoDTOS = todoDTOS;
    }
}
