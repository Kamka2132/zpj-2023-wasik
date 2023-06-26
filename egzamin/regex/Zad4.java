// DOPASOWANIE ŁANCUCHA DO REGEXU

package egzamin.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj łańcuch: ");
        String lancuch = sc.nextLine();

        String regex = "^[a-zA-Z0-9]+$";
        Pattern wzor = Pattern.compile(regex);
        Matcher matcher = wzor.matcher(lancuch);

        if (matcher.matches()) {
            System.out.println("znalezione: " + lancuch);
        } else {
            System.out.println("brak");

        }

        sc.close();
    }
}
