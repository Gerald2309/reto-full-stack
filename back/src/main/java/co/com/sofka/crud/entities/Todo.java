package co.com.sofka.crud.entities;

import co.com.sofka.crud.entities.values.IsCompleted;
import co.com.sofka.crud.entities.values.Label;

import javax.persistence.*;

@Entity
@Table(name = "Todos")
public class Todo {
    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "label",nullable = false)
    private Label label;

    @Column(name = "isCompleted",nullable = false)
    private IsCompleted isCompleted;

    @Column(name = "todo_list_id",nullable = false)
    private String todoListId;


    public String getTodoListId() {
        return todoListId;
    }

    public void setTodoListId(String todoListId) {
        this.todoListId = todoListId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public IsCompleted isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(IsCompleted isCompleted) {
        this.isCompleted = isCompleted;
    }
}
