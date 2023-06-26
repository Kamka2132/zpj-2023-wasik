package egzamin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad26 {
    public static void main(String[] args) {
        String sciezka = "/home/student/xd/mojplik.txt";

        // KATALOG
        String katalog_regex = "(?<=/|^)[^/]+(?=/)";
        Pattern katalog_pattern = Pattern.compile(katalog_regex);
        Matcher katalog_matcher = katalog_pattern.matcher(sciezka);

        System.out.println("Nazwy katalogów:");
        while (katalog_matcher.find()) {
            String dopasowanie = katalog_matcher.group();
            System.out.println(dopasowanie);
        }

        // NAZWA I ROZSZERZENIE
        String plik_regex = "(?<=/|^)([^/]+)\\.([^/\\.]+)$";
        Pattern plik_pattern = Pattern.compile(plik_regex);
        Matcher plik_matcher = plik_pattern.matcher(sciezka);

        if (plik_matcher.find()) {
            String plik = plik_matcher.group(1);
            String rozszerzenie = plik_matcher.group(2);
            System.out.println("Nazwa pliku: " + plik);
            System.out.println("Rozszerzenie pliku: " + rozszerzenie);
        }
    }
}
