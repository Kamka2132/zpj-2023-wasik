package lab10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad28 {
    public static void main(String[] args) {
        String text = "Przyjęty: 25-06-2012, Zwolniony: 02-01-2023";

        String regex = "(\\d{2})-(\\d{2})-(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String wynik = matcher.replaceAll("$2.$1.$3");

        System.out.println("Wynik:");
        System.out.println(wynik);
    }
}