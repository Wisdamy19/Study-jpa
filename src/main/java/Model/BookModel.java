package Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table (name = "TB_book")
public class BookModel {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String title;
    @ManyToMany
    @JoinTable()
    private Set<AuthorModel> author = new HashSet<>();
    @Column
    private String synopsis;
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private PublisherModel publisher;

    public BookModel() {
    }

    public BookModel(UUID id, String title, Set<AuthorModel> author, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.synopsis = description;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<AuthorModel> getAuthor() {
        return author;
    }

    public void setAuthor(Set<AuthorModel> author) {
        this.author = author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public PublisherModel getPublisher() {
        return publisher;
    }
    public void setPublisher(PublisherModel publisher) {
        this.publisher = publisher;
    }
}
