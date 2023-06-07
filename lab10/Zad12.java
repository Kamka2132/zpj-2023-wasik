package lab10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad12 {
    public static void main(String[] args) {

        String regex = "\\w+[.,!?]?";
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = sc.nextLine();

        sc.close();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);

        String ostatniWyraz = "";
        while (matcher.find()) {
            ostatniWyraz = matcher.group();
        }

        System.out.println("Ostatni wyraz: " + ostatniWyraz);

    }
}