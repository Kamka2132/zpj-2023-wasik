package lab13;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Zad7 {
    public static void main(String[] args) {
        Locale[] dostepneJezyki = Locale.getAvailableLocales();

        for (Locale jezyk : dostepneJezyki) {
            DateFormatSymbols symbols = new DateFormatSymbols(jezyk);
            String[] nazwyMiesiecy = symbols.getMonths();

            boolean czyRozne = sprawdzRozneMiesiace(nazwyMiesiecy);

            if (czyRozne && !czyZawierajaCyfry(nazwyMiesiecy)) {
                System.out.println("Język: " + jezyk.getDisplayName() + " (" + jezyk.getLanguage() + ")");
                for (int i = 0; i < nazwyMiesiecy.length - 1; i++) {
                    System.out.println("Miesiąc " + (i + 1) + ": " + nazwyMiesiecy[i]);
                }
                System.out.println();
            }
        }
    }

    private static boolean sprawdzRozneMiesiace(String[] nazwyMiesiecy) {
        for (int i = 1; i < nazwyMiesiecy.length; i++) {
            if (!nazwyMiesiecy[i].equals(nazwyMiesiecy[i - 1])) {
                return true;
            }
        }
        return false;
    }

    private static boolean czyZawierajaCyfry(String[] nazwyMiesiecy) {
        for (String nazwaMiesiaca : nazwyMiesiecy) {
            if (czyZawieraCyfry(nazwaMiesiaca)) {
                return true;
            }
        }
        return false;
    }

    private static boolean czyZawieraCyfry(String tekst) {
        for (char znak : tekst.toCharArray()) {
            if (Character.isDigit(znak)) {
                return true;
            }
        }
        return false;
    }
}
