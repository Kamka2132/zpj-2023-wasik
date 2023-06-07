package lab10;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj łańcuch: ");
        String lancuch = sc.nextLine();

        String regex = "^abbb$";
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
