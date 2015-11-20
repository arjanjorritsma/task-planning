package nl.arjan.taskplanning.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity for planning of tasks
 * Created by arjan on 20-11-15.
 */
@Entity
@Data
public class TaskPlanning {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Valid
    @OneToOne(optional = false)
    private TaskType taskType;

    @NotNull
    @Column(nullable = false)
    private LocalDate startDate;

    private LocalDate endDate;

    @OneToMany(mappedBy = "taskPlanning")
    private List<ExecutedTask> executedTasks = new ArrayList<>();

    public void addExecutedTask(ExecutedTask executedTask) {
        executedTask.setTaskPlanning(this);
        this.executedTasks.add(executedTask);
    }

}
