package egzamin.regex;

import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj łańcuch znaków: ");
        String lancuch = sc.nextLine();

        String nowyLancuch = zamienTrzyliteroweSlowa(lancuch);

        System.out.println("Nowy łańcuch po zamianie:");
        System.out.println(nowyLancuch);

        sc.close();
    }

    public static String zamienTrzyliteroweSlowa(String lancuch) {
        String[] slowa = lancuch.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String slowo : slowa) {
            if (slowo.length() == 3 && slowo.startsWith("c")) {
                sb.append(slowo.toUpperCase());
            } else {
                sb.append(slowo);
            }

            sb.append(" ");
        }

        return sb.toString().trim(); // .trim() - usuwa biale znaki z konca i poczatku
    }
}
