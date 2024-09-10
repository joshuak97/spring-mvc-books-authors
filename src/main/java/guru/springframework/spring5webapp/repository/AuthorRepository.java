package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface AuthorRepository
 * @since 10 Sept. 2024.
 * @author Josue Cruz Santiago.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
