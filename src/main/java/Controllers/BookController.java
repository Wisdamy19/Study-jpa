package Controllers;

import DTO.BookRecordDTO;
import Model.BookModel;
import Service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
/*
    @PostMapping
    public ResponseEntity<BookModel> saveBook(@RequestBody BookRecordDTO bookRecordDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(bookRecordDTO));
    }
 */

    @GetMapping()
    public ResponseEntity<List<BookModel>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }
}
