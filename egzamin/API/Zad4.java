package egzamin.API;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Zad4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("YYYY-MM-DD: ");
            return;
        }
        String data_string = args[0];
        try {
            LocalDate podanaData = LocalDate.parse(data_string);

            LocalDate dzisiaj = LocalDate.now();
            long ile_pomiedzy = ChronoUnit.DAYS.between(podanaData, dzisiaj);
            System.out.println("Liczba dni: " + ile_pomiedzy);
        } catch (DateTimeParseException e) {
            System.out.println("Nieprawidłowy format daty.");
        }
    }
}
