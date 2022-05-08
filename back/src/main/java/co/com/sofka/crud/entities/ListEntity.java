package co.com.sofka.crud.entities;
import javax.persistence.*;

@Entity
@Table(name = "list")

public class ListEntity {
    @Id
    @Column(name = "list_id", nullable = false)
    private String id;

    @Column(name = "label",nullable = false)
    private String label;


    public ListEntity(){}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
