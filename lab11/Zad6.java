package lab11;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Zad6 {
    public static void main(String[] args) {
        int rokPoczatkuWieku = 1901; // pierwszy rok XX w
        int rokKoncaWieku = 2000; // ostatni rok XX w

        for (int r = rokPoczatkuWieku; r <= rokKoncaWieku; r++) {
            // Iteracja po miesiącach
            for (int miesiac = 1; miesiac <= 12; miesiac++) {
                // utworzenie daty 13-stego dnia danego miesiąca i roku
                LocalDate data = LocalDate.of(r, miesiac, 13);
                DayOfWeek dzienTygodnia = data.getDayOfWeek();

                // jeżeli piątek to wypisuje tą datę
                if (dzienTygodnia == DayOfWeek.FRIDAY) {
                    System.out.println(data);
                }
            }
        }
    }
}
