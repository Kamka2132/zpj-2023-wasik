package egzamin.regex;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class testowe {
    public static void main(String[] args) {
        LocalDate dzisiaj = LocalDate.now();
        System.out.println("dzisiaj: " + dzisiaj);

        LocalDate kamila = LocalDate.of(2002, 12, 26);
        // kamila = LocalDate.of(2002, Month.DECEMBER, 26);
        System.out.println("Moje urodziny: " + kamila);

        LocalDate walentynki = LocalDate.of(2023, 1, 1).plusDays(44);
        System.out.println("walentynki: " + walentynki);

        LocalDate swieta = LocalDate.of(2023, Month.DECEMBER, 24);
        System.out.println("Do swiat: " + walentynki.until(swieta, ChronoUnit.DAYS));

        DayOfWeek mojeuro = LocalDate.of(2002, 12, 26).getDayOfWeek();
        System.out.println("mojeuro w 2002 roku:" + mojeuro);

    }

}