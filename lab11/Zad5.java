package lab11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Zad5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Podaj datę w formacie YYYY-MM-DD jako argument");
            return;
        }

        String dateString = args[0];
        LocalDate podanaData = LocalDate.parse(dateString);

        LocalDate dzisiejszaData = LocalDate.now();
        long dniMiedzy = ChronoUnit.DAYS.between(podanaData, dzisiejszaData);

        System.out.println("Liczba dni od podanej daty: " + dniMiedzy);
    }
}
