package nl.arjan.taskplanning.domain;

/**
 * Enummeration for types of repeat patterns for tasks
 * Created by arjan on 20-11-15.
 */
public enum RepeatPattern {
    DAILY(1), DAILY_WORKDAYS(1), WEEKLY(1), TWO_WEEKLY(2), MONTHLY(1), TWO_MONTHLY(2);

    private int interval;

    RepeatPattern(int interval) {
        this.interval = interval;
    }
}
