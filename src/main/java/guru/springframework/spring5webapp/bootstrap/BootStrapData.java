package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * The Class BootStrapData
 * @since 10 Sept. 2024.
 * @author Josue Cruz Santiago.
 */
@Component
public class BootStrapData implements CommandLineRunner {


    private static final Logger log = LoggerFactory.getLogger(BootStrapData.class);
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    /**
     *
     * @param args args
     * @throws Exception exception
     */
    @Override
    public void run(String... args) throws Exception {

        Author author = new Author("Andres", "Openheimer");
        Book book = new Book("Crear o Morir", "123456");
        author.setBooks(getBooks(book));
        book.setAuthors(getAuthors(author));
        authorRepository.save(author);
        bookRepository.save(book);

        Author author2 = new Author("Rod", "Johnson");
        Book book2 = new Book("J2EE Development without EJB", "123123");
        author2.setBooks(getBooks(book2));
        book2.setAuthors(getAuthors(author2));
        authorRepository.save(author2);
        bookRepository.save(book2);


        log.info("Started in Bootstrap");
        log.info("Number of Books : {}", bookRepository.count());

    }

    /**
     * getAuthors
     * @param author author
     * @return authors
     */
    private Set<Author> getAuthors(Author author) {
        Set<Author> authors = new HashSet<>();
        authors.add(author);
        return authors;
    }

    /**
     * getBooks
     * @param book book
     * @return books
     */
    private Set<Book> getBooks(Book book) {
        Set<Book> books = new HashSet<>();
        books.add(book);
        return books;
    }
}
