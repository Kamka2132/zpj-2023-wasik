package lab6;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String napis = sc.nextLine();

        napis = napis.trim(); // usuwanie białych znaków na początku i końcu

        int liczba_znakow = napis.length();
        int liczba_slow = policzSlowa(napis);
        double srednia_dlugosc = (double) liczba_znakow / liczba_slow;

        System.out.println("Średnia długość ciągu znaków wynosi: " + srednia_dlugosc);

        sc.close();

    }

    private static int policzSlowa(String napis) {
        int liczba_slow = 0;
        boolean w_slowie = false;

        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);
            if (Character.isWhitespace(znak)) {
                w_slowie = false;
            } else if (!w_slowie) {
                w_slowie = true;
                liczba_slow++;
            }
        }

        return liczba_slow;

    }
}
