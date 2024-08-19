package Service;

import Model.AuthorModel;
import Model.BookModel;
import Repositories.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public List<AuthorModel> getAllAuthors() {
        return authorRepository.findAll();
    }
}
