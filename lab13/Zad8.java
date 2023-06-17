package lab13;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Zad8 {
    public static void main(String[] args) {
        // Lista lokalizacji, w których nazwy miesięcy są różne
        List<Locale> lokalizacjeZRoznymiNazwamiMiesiecy = pobierzLokalizacjeZRoznymiNazwamiMiesiecy();

        // Wyświetlanie wyników
        if (lokalizacjeZRoznymiNazwamiMiesiecy.isEmpty()) {
            System.out.println("Brak lokalizacji, w których nazwy miesięcy są różne (inne niż cyfry).");
        } else {
            System.out.println("Lokalizacje, w których nazwy miesięcy są różne (inne niż cyfry):");
            for (Locale lokalizacja : lokalizacjeZRoznymiNazwamiMiesiecy) {
                System.out.println(lokalizacja.getDisplayName());
            }
        }
    }

    // Metoda zwracająca lokalizacje, w których nazwy miesięcy są różne (inne niż
    // cyfry)
    private static List<Locale> pobierzLokalizacjeZRoznymiNazwamiMiesiecy() {
        List<Locale> lokalizacjeZRoznymiNazwamiMiesiecy = new ArrayList<>();

        for (Locale lokalizacja : Locale.getAvailableLocales()) {
            String[] nazwyMiesiecy = new DateFormatSymbols(lokalizacja).getMonths();

            if (czyRozneNazwyMiesiecy(nazwyMiesiecy) && !czyWszystkieCyfry(nazwyMiesiecy)) {
                lokalizacjeZRoznymiNazwamiMiesiecy.add(lokalizacja);
            }
        }

        return lokalizacjeZRoznymiNazwamiMiesiecy;
    }

    // Metoda sprawdzająca, czy wszystkie nazwy miesięcy są różne
    private static boolean czyRozneNazwyMiesiecy(String[] nazwyMiesiecy) {
        for (int i = 1; i < nazwyMiesiecy.length; i++) {
            if (!nazwyMiesiecy[i].equals(nazwyMiesiecy[0])) {
                return true;
            }
        }
        return false;
    }

    // Metoda sprawdzająca, czy wszystkie nazwy miesięcy składają się z cyfr
    private static boolean czyWszystkieCyfry(String[] nazwyMiesiecy) {
        for (String nazwaMiesiaca : nazwyMiesiecy) {
            if (!nazwaMiesiaca.matches("\\d+")) {
                return false;
            }
        }
        return true;
    }
}
