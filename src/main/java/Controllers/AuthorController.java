package Controllers;

import Model.AuthorModel;
import Model.BookModel;
import Service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    /*
    @GetMapping("/all")
    public ResponseEntity<List<AuthorModel>> getAllAuthors() {
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAllAuthors());
    }
     */
    @GetMapping("/all")
    public ResponseEntity<List<AuthorModel>> getAllAuthors(){
        List<AuthorModel> authors = authorService.getAllAuthors();
        return ResponseEntity.status(HttpStatus.OK).body(authors);
    }
}
