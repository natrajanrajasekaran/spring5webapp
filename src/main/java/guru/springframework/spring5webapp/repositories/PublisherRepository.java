package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * created by NR on 30 Jun 2018
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
