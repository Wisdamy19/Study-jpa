package Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "TB_Rent_Book")
public class RentBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "date")
    private java.time.LocalDateTime date;
    @Column
    private java.time.LocalDate deliveryDate;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookModel bookModel;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentModel student;

    public RentBookModel() {
    }

    public RentBookModel(UUID id, LocalDateTime date, LocalDate deliveryDate, BookModel bookModel, StudentModel student) {
        this.id = id;
        this.date = date;
        this.deliveryDate = deliveryDate;
        this.bookModel = bookModel;
        this.student = student;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BookModel getBookModel() {
        return bookModel;
    }

    public void setBookModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }

    public StudentModel getStudent() {
        return student;
    }

    public void setStudent(StudentModel student) {
        this.student = student;
    }
}
