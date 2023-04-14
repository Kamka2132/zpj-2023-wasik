package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        try {
            // otwarcie pliku i utworzenie skanera
            File file = new File("war_and_peace.txt");
            Scanner sc = new Scanner(file);

            // mapa przechowująca częstości występowania słów
            Map<String, Integer> czestosc_wystepowania_slow = new HashMap<>();

            // przetwarzanie pliku linia po linii
            while (sc.hasNextLine()) {
                String linia = sc.nextLine();

                // przetwarzanie linii - dzielenie na słowa i aktualizacja mapy
                String[] slowa = linia.split("[\\P{L}]+"); // podział na słowa
                for (String word : slowa) {
                    if (!word.isEmpty()) { // ignorowanie pustych słów
                        String slowa_napisane_malymi_literami = word.toLowerCase(); // konwersja na małe litery
                        czestosc_wystepowania_slow.put(slowa_napisane_malymi_literami, czestosc_wystepowania_slow.getOrDefault
                                                            (slowa_napisane_malymi_literami, 0) + 1); // aktualizacja mapy
                    }
                }
            }

            // wyświetlenie 10 najczęściej występujących słów
            czestosc_wystepowania_slow.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
