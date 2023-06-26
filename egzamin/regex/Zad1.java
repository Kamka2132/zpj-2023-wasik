// ZNAJDŹ JEDNO LUB WIELE DOPASOWAŃ
// konsola, try/catch, regex

package egzamin.regex;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;

public class Zad1 {
    public static void main(String[] args) {
        Console konsola = System.console();
        if (konsola == null) {
            System.err.println("Brak konsoli");
            System.exit(1);
        }
        while (true) {
            String regex = konsola.readLine("%nWprowadź swój regex (naciśnij ENTER, aby zakończyć): ");
            if (regex.isEmpty()) {
                konsola.format("%n%s%n", "Program się zakończył");
                System.exit(2);
            }
            Pattern pattern = null;
            try {
                pattern = Pattern.compile(regex);
            } catch (PatternSyntaxException exception) {
                konsola.format("%s%n", exception.getDescription());
                continue;
            }
            while (true) {
                String string = konsola.readLine("Wprowadź ciąg znaków (wciśnij ENTER, aby zakończyć): ");
                if (string.isEmpty()) {
                    konsola.format("%n%s%n", "Potrzebny nowy regex");
                    break;
                }
                Matcher matcher = pattern.matcher(string);
                boolean found = false;
                while (matcher.find()) {
                    konsola.format("Znaleziony tekst" +
                            " \"%s\" ",
                            matcher.group());
                    found = true;
                }
                if (!found) {
                    konsola.format("NIE MA TAKICH DOPASOWAŃ%n");
                }
            }
        }
    }
}
