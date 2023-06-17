package lab13;

import java.util.*;

public class Zad6 {
    public static void main(String[] args) {
        Set<Currency> dostepneWaluty = Currency.getAvailableCurrencies();

        List<String> walutyZSymbolem = new ArrayList<>();

        for (Currency waluta : dostepneWaluty) {
            Set<String> symbole = new HashSet<>();

            Locale[] dostepneJezyki = Locale.getAvailableLocales();

            for (Locale jezyk : dostepneJezyki) {
                String symbol = waluta.getSymbol(jezyk);
                if (!symbol.isEmpty()) {
                    symbole.add(symbol);
                }
            }

            if (symbole.size() > 1) {
                walutyZSymbolem.add(waluta.getCurrencyCode());
            }
        }

        for (String waluta : walutyZSymbolem) {
            System.out.println(waluta);
        }
    }
}
