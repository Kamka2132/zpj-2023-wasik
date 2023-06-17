package lab13;

import java.util.*;

public class Zad4 {
    public static void main(String[] args) {
        Locale[] dostepneLokalizacje = Locale.getAvailableLocales();

        Set<String> unikalneNazwyJezykow = new HashSet<>();

        for (Locale lokalizacja : dostepneLokalizacje) {
            String nazwaJezyka = lokalizacja.getDisplayName(lokalizacja);
            if (!nazwaJezyka.isEmpty()) {
                unikalneNazwyJezykow.add(nazwaJezyka);
            }
        }

        for (String nazwaJezyka : unikalneNazwyJezykow) {
            System.out.println(nazwaJezyka);
        }

        int iloscPozycji = zliczPozycje(unikalneNazwyJezykow);
        System.out.println("Ilość pozycji: " + iloscPozycji);
    }

    private static int zliczPozycje(Set<String> zbior) {
        return zbior.size();
    }
}
