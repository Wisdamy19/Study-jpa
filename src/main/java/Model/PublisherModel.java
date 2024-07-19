package Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name = "TB_Publisher")
public class PublisherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;
    @OneToMany(mappedBy = "publisher")
    private Set<BookModel> bookModel = new HashSet<>();

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

    public Set<BookModel> getBookModel() {
        return bookModel;
    }

    public void setBookModel(Set<BookModel> bookModel) {
        this.bookModel = bookModel;
    }
}
