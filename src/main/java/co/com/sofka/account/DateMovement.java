package co.com.sofka.account;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateMovement {
    private LocalDate date;

    private DateMovement(LocalDate date) {
        this.date = date;
    }

    public static DateMovement dateMovementOf(String date) {
        return new DateMovement(LocalDate.parse(date, DateTimeFormatter.ofPattern("d/MM/yyyy")));
    }

    public String format() {
        return date.format(DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }

}
