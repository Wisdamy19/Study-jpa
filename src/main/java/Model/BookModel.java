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
    private int id;
    @Column(name = "title")
    private String title;
    @ManyToMany
    @JoinTable(name = "tb_book_author", joinColumns = @JoinColumn(name = "book_id"),
     inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<AuthorModel> authors = new HashSet<>();
    @Column(name = "synopsis")
    private String synopsis;
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private PublisherModel publisher;
    @OneToMany(mappedBy = "bookModel")
    private Set<RentBookModel> rentBookModels = new HashSet<>();

    public BookModel() {
    }

    public BookModel(int id, String title, Set<AuthorModel> authors, String synopsis, PublisherModel publisher, Set<RentBookModel> rentBookModels) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.synopsis = synopsis;
        this.publisher = publisher;
        this.rentBookModels = rentBookModels;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorModel> author) {
        this.authors = author;
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

    public Set<RentBookModel> getRentBookModels() {
        return rentBookModels;
    }

    public void setRentBookModels(Set<RentBookModel> rentBookModels) {
        this.rentBookModels = rentBookModels;
    }
}
