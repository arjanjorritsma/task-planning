package nl.arjan.taskplanning.domain.repository;

import nl.arjan.taskplanning.domain.ExecutedTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Repository for ExecutedTask entities
 * Created by arjan on 20-11-15.
 */
@RepositoryRestResource
public interface ExecutedTaskRepository extends JpaRepository<ExecutedTask, Long> {
}
