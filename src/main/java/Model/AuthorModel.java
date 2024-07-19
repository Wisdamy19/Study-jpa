package Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name = "TB_Author")
public class AuthorModel {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
