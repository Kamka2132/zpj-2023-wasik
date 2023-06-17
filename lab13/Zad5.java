package lab13;

import java.util.*;

public class Zad5 {
    public static void main(String[] args) {
        Set<Currency> dostepneWaluty = Currency.getAvailableCurrencies();

        Set<String> unikalneNazwyWalut = new HashSet<>();

        for (Currency waluta : dostepneWaluty) {
            String kodWaluty = waluta.getCurrencyCode();
            Locale[] dostepneJezyki = Locale.getAvailableLocales();

            for (Locale jezyk : dostepneJezyki) {
                String nazwaWaluty = waluta.getDisplayName(jezyk);
                if (!nazwaWaluty.isEmpty()) {
                    unikalneNazwyWalut.add(nazwaWaluty);
                }
            }
        }

        for (String nazwaWaluty : unikalneNazwyWalut) {
            System.out.println(nazwaWaluty);
        }

        int iloscPozycji = zliczPozycje(unikalneNazwyWalut);
        System.out.println("Ilość pozycji: " + iloscPozycji);
    }

    private static int zliczPozycje(Set<String> zbior) {
        return zbior.size();
    }
}
