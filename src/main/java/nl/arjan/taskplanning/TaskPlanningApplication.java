package nl.arjan.taskplanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(
        basePackageClasses = {TaskPlanningApplication.class, Jsr310JpaConverters.class}
)
public class TaskPlanningApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskPlanningApplication.class, args);
    }
}
