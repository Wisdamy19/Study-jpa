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
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "authors")
    private Set<BookModel> books = new HashSet<>();

    public AuthorModel() {
    }

    public AuthorModel(int id, String name, Set<BookModel> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
