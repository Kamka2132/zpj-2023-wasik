package lab11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj miesiąc: ");
        int miesiac = sc.nextInt();
        System.out.println("Podaj rok: ");
        int rok = sc.nextInt();

        LocalDate data = LocalDate.of(rok, miesiac, 1);

        int liczbaDniWMiesiacu = data.lengthOfMonth();
        DayOfWeek pierwszyDzienTygodnia = data.getDayOfWeek();

        int dzienMiesiaca = 1;
        int dzienTygodnia = pierwszyDzienTygodnia.getValue();

        System.out.println(" PN  WT  ŚR  CZ  PT  SB  ND");

        for (int tydzien = 0; tydzien < 6; tydzien++) {
            for (int dzien = 0; dzien < 7; dzien++) {
                if (tydzien == 0 && dzien < pierwszyDzienTygodnia.getValue()) {
                    System.out.print("    ");
                } else if (dzienMiesiaca > liczbaDniWMiesiacu) {
                    break;
                } else {
                    System.out.printf("%3d ", dzienMiesiaca);
                    dzienMiesiaca++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
