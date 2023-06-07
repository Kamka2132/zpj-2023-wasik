package lab10;

import java.util.Scanner;
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
        String regex = "\\d+[A-Z]?/\\d+[A-Z]?";
        return Pattern.matches(regex, numerDomu);
    }
}
