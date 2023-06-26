package egzamin.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer domu:");
        String numerDomu = scanner.nextLine();

        boolean poprawnyFormat = sprawdzFormatNumeruDomu(numerDomu);

        if (poprawnyFormat) {
            System.out.println("Poprawny format numeru domu.");
        } else {
            System.out.println("Niepoprawny format numeru domu.");
        }

        scanner.close();
    }

    public static boolean sprawdzFormatNumeruDomu(String numerDomu) {
        String regex = "\\d+[A-Za-z]?[/\\\\]?\\d*[A-Za-z]?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numerDomu);
        return matcher.matches();
    }
}
