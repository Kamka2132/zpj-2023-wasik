package lab11;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Zad3 {
    public static void main(String[] args) {
        LocalDate dzisiaj = LocalDate.now();
        LocalDate kolejnyDzienRoboczy = znajdzKolejnyDzienRoboczy(dzisiaj.plusDays(1));
        System.out.println("Kolejny dzień roboczy: " + kolejnyDzienRoboczy);
    }

    public static LocalDate znajdzKolejnyDzienRoboczy(LocalDate data) {
        while (!czyDzienRoboczy(data)) {
            data = data.plusDays(1);
        }
        return data;
    }

    public static boolean czyDzienRoboczy(LocalDate data) {
        DayOfWeek dayOfWeek = data.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
}
