package nl.arjan.taskplanning.domain;

import lombok.Data;
import nl.arjan.taskplanning.domain.RepeatPattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Entity for types of tasks
 * Created by arjan on 20-11-15.
 */
@Entity
@Data
public class TaskType {
    @Id @GeneratedValue
    private Long id;

    @NotNull @Column(nullable = false)
    private String description;

    @NotNull @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private RepeatPattern repeatPattern;

    @NotNull @Column(nullable = false)
    private LocalDate start;

    @NotNull @Column(nullable = false)
    private String prefferedUser;

}
