package lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad4 {
    public static void main(String[] args) {
        List<String> samogloski = Arrays.asList("a", "e", "i", "o", "u", "y");

        List<String> lista_slow = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                List<String> slowo_z_5_samogloskami = Arrays.stream(linia.split(""))
                        .filter(samogloski::contains)
                        .distinct()
                        .collect(Collectors.toList());

                if (slowo_z_5_samogloskami.size() == 5) {
                    lista_slow.add(linia);
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(lista_slow);
    }
}
