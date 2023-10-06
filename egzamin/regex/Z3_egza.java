package egzamin.regex;

import java.util.Scanner;

public class Z3_egza {

    public static String usunZera(String adresIP) {
        String[] grupa = adresIP.split("\\.");
        StringBuilder result = new StringBuilder();

        for (String x : grupa) {
            // Usuwanie początkowych zer
            String ucieteZera = String.valueOf(Integer.parseInt(x));
            // Dodawanie oktetów do wyniku
            result.append(ucieteZera).append(".");
        }
        // Usunięcie ostatniej kropki
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj adres IP: ");
        String adresIP = sc.nextLine();

        String nowy_adresIP = usunZera(adresIP);
        System.out.println("Adres IP bez początkowych zer: " + nowy_adresIP);
    }
}
