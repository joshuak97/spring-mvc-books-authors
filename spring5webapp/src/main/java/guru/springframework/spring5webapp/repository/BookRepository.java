package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface BookRepository
 * @since 10 Sept. 2024.
 * @author Josue Cruz Santiago.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
