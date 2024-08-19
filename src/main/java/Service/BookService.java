package Service;

import DTO.BookRecordDTO;
import Model.AuthorModel;
import Model.BookModel;
import Model.PublisherModel;
import Repositories.AuthorRepository;
import Repositories.BookRepository;
import Repositories.PublisherRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }



    @Transactional
    public BookModel saveBook(BookRecordDTO bookRecordDTO){
        BookModel book = new BookModel();
        book.setTitle(bookRecordDTO.title());
        book.setAuthors(authorRepository.findAllById(bookRecordDTO.authorsID()).stream().collect(Collectors.toSet()));
        book.setSynopsis(bookRecordDTO.synopsis());
        book.setPublisher(publisherRepository.findById(bookRecordDTO.publisherId()).get());

        return bookRepository.save(book);
    }
    @Transactional
    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    /*
    @Transactional
    public BookModel saveBook(BookRecordDTO bookRecordDTO) {
        // Verificar se todos os autores existem
        Set<AuthorModel> authors = authorRepository.findAllById(bookRecordDTO.authorsID()).stream().collect(Collectors.toSet());
        if (authors.size() != bookRecordDTO.authorsID().size()) {
            throw new IllegalArgumentException("Um ou mais autores não foram encontrados.");
        }

        // Verificar se o editor existe
        PublisherModel publisher = publisherRepository.findById(bookRecordDTO.publisherId())
                .orElseThrow(() -> new IllegalArgumentException("Editor não encontrado."));

        // Criar e salvar o livro
        BookModel book = new BookModel();
        book.setTitle(bookRecordDTO.title());
        book.setAuthors(authors);
        book.setSynopsis(bookRecordDTO.synopsis());
        book.setPublisher(publisher);

        return bookRepository.save(book);
    }
     */
}
