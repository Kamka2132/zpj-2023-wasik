package lab13;

import java.util.Locale;

public class Zad3 {
    public static void main(String[] args) {
        Locale[] dostepneLokalizacje = Locale.getAvailableLocales();

        for (Locale lokalizacja : dostepneLokalizacje) {
            String wzorzecFormatuDaty = lokalizacja.getUnicodeLocaleType("ca");
            if (wzorzecFormatuDaty != null && wzorzecFormatuDaty.equals("gregory")) {
                System.out.println("Lokalizacja z formatem daty podobnym do Stanów Zjednoczonych: "
                        + lokalizacja.getDisplayName());
            }
        }
    }
}
