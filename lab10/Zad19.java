package lab10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj miasto: ");
        String miasto = sc.nextLine();

        boolean poprawnaNazwa = sprawdzPoprawnoscNazwyMiasta(miasto);

        if (poprawnaNazwa) {
            System.out.println("Poprawna nazwa miasta");
        } else {
            System.out.println("Niepoprawna nazwa miasta");
        }

        sc.close();
    }

    public static boolean sprawdzPoprawnoscNazwyMiasta(String miasto) {
        String regex = "\\b[A-ZĄĘŚĆŁŃÓŻŹ][A-Za-ząęśćłńóżźĄĘŚĆŁŃÓŻŹ\\s-]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(miasto);
        return matcher.find();
    }

}
