package guru.springframework.spring5webapp.domain.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author,Long> {
}
