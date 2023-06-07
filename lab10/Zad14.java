package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tekst = sc.nextLine();

        List<String> sekwencje = znajdz(tekst);

        System.out.println("Znalezione sekwencje:");
        for (String sekwencja : sekwencje) {
            System.out.println(sekwencja);
        }

        sc.close();
    }

    public static List<String> znajdz(String tekst) {
        List<String> lista_sekwencji = new ArrayList<>();

        String regex = "\\b\\w+\\B[z]\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);

        while (matcher.find()) {
            String sekwencja = matcher.group();
            lista_sekwencji.add(sekwencja);
        }

        return lista_sekwencji;
    }
}
