package lab10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String lancuch = sc.nextLine();

        System.out.println("Podaj cyfrę:");
        String cyfra = sc.nextLine();

        boolean dopasowanie = dopasujLancuch(lancuch, cyfra);

        if (dopasowanie) {
            System.out.println("Pasuje");
        } else {
            System.out.println("Łańcuch nie pasuje.");
        }

        sc.close();
    }

    public static boolean dopasujLancuch(String lancuch, String cyfra) {
        String regex = "^" + cyfra + "\\S*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lancuch);

        return matcher.find();
    }
}
