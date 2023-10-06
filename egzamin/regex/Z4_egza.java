package egzamin.regex;

import java.util.Scanner;

public class Z4_egza {

    public static String zamiana(String input) {
        return input.replaceAll("[ .]", ":");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź łańcuch: ");
        String input = sc.nextLine();

        String replacedString = zamiana(input);
        System.out.println("Wynik: " + replacedString);
    }
}
