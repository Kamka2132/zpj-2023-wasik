package egzamin.regex;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class testowe {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(6, 30);
        LocalTime koniec = LocalTime.of(15, 45);

        Duration trwanie = Duration.between(start, koniec);

        long godziny = trwanie.toHours();
        long minuty = trwanie.toMinutes() % 60;

        System.out.println("Godz: " + godziny + "min: " + minuty);
    }
}