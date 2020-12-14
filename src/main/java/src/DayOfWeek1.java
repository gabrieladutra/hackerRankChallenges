package src;

import java.time.*;

public class DayOfWeek1 {
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        return dayOfWeek.name();
    }

    public static void main(String[] args) {
        System.out.println(findDay(1,5,2000));

    }
}
