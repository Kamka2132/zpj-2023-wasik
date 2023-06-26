// PRZYKŁADOWE OPERACJE NA DACIE

package egzamin.API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Dzisiejsza data
        System.out.println("dziś: " + today);

        LocalDate alonzosBirthday = LocalDate.of(1903, 6, 14);
        alonzosBirthday = LocalDate.of(1903, Month.JUNE, 14);
        // Wykorzystuje typ wyliczeniowy Month
        System.out.println("urodzinyAlonzo: " + alonzosBirthday);

        LocalDate programmersDay = LocalDate.of(2020, 1, 1).plusDays(255);
        // 13. września, ale w roku przestępnym 12. września
        System.out.println("dzieńProgramisty: " + programmersDay);

        LocalDate independenceDay = LocalDate.of(2022, Month.JULY, 4);
        LocalDate christmas = LocalDate.of(2022, Month.DECEMBER, 25);
        System.out.println("Do Bożego Narodzenia: " + independenceDay.until(christmas));
        System.out.println("Do Bożego Narodzenia: " + independenceDay.until(christmas, ChronoUnit.DAYS));
        System.out.println(LocalDate.of(2020, 1, 31).plusMonths(1));
        System.out.println(LocalDate.of(2020, 3, 31).minusMonths(1));

        DayOfWeek startOfLastMillennium = LocalDate.of(1900, 1, 1).getDayOfWeek();
        System.out.println("początekZeszłegoWieku: " + startOfLastMillennium);
        System.out.println(startOfLastMillennium.getValue());
        System.out.println(DayOfWeek.SATURDAY.plus(3));
    }
}
