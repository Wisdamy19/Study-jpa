package Repositories;

import Model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.Set;
import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {

}
