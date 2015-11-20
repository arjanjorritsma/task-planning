package nl.arjan.taskplanning.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Entity for executed tasks
 * Created by arjan on 20-11-15.
 */
@Entity
@Data
public class ExecutedTask {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String user;

    @NotNull
    @Past
    @Column(nullable = false)
    private LocalDateTime executeTime;

    private Duration duration;

    @ManyToOne(optional = false)
    @Valid
    private TaskPlanning taskPlanning;

}
