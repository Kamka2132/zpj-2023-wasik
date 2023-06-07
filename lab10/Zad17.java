package lab10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę zmiennoprzecinkową:");
        String liczba = scanner.nextLine();

        boolean poprawnyFormat = sprawdzFormatLiczby(liczba);

        if (poprawnyFormat) {
            System.out.println("Poprawny format liczby.");
        } else {
            System.out.println("Niepoprawny format liczby.");
        }

        scanner.close();
    }

    public static boolean sprawdzFormatLiczby(String liczba) {
        // [+-]? - opcjonalny znka + lub -
        // \\d+(?:\\.\\d*)? - dopasowuje liczbe calkowita, ktora moze byc poprzedzona
        // liczba dziesietna
        // \\.\\d+ - liczby po kropce
        String regex = "^[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)$";
        return Pattern.matches(regex, liczba);
    }
}
