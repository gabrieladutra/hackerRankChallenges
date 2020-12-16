/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a
set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields,
such as getting the date of the next week.
You are given a date. You just need to write the method,getDay, which returns the day on that date.
 */

package src;

import java.time.*;
import java.util.Scanner;

public class DayOfWeek1 {
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        return dayOfWeek.name();
    }


}
