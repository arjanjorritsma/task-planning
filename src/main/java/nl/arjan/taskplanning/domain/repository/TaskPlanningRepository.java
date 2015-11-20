package nl.arjan.taskplanning.domain.repository;

import nl.arjan.taskplanning.domain.TaskPlanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Repostory for TaskPlanning entities
 * Created by arjan on 20-11-15.
 */
@RepositoryRestResource
public interface TaskPlanningRepository extends JpaRepository<TaskPlanning, Long> {
}
