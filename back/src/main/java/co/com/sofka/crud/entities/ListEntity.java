package co.com.sofka.crud.entities;
import javax.persistence.*;

@Entity
@Table(name = "list")

public class ListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id", nullable = false)
    private Integer id;

    @Column(name = "label",nullable = false)
    private String label;


    public ListEntity(){}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
