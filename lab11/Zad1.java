package lab11;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Podaj rok: ");
        Scanner sc = new Scanner(System.in);
        int rok = sc.nextInt();
        // tworzenie daty dla 1 stycznia danego roku
        LocalDate data = LocalDate.of(rok, Month.JANUARY, 1);

        // dodawanie dni do początkowej daty aż do 256 dnia roku
        int dzien_w_roku = 1;
        while (dzien_w_roku < 256) {
            data = data.withDayOfYear(data.getDayOfYear() + 1);
            dzien_w_roku++;
        }

        System.out.println("Dzień Programisty w roku " + rok + ": " + data);
        sc.close();

    }
}
