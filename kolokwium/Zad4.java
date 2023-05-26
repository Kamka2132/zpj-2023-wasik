package kolokwium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Zad4 {
    public static void main(String[] args) {
        String plik = "C:/Users/Lap/zpj-2023-wasik/kolokwium/plik.txt";

        try (Stream<String> lines = Files.lines(Paths.get(plik))) {
            OptionalDouble averageLength = lines.mapToInt(String::length).average();

            if (averageLength.isPresent()) {
                System.out.println("Średnia długość słów: " + averageLength.getAsDouble());
            } else {
                System.out.println("nie można obliczyć średniej długości wyrazów");
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }

        try (Stream<String> lines = Files.lines(Paths.get(plik))) {
            Optional<String> najdluzsze_slowo = lines.max(Comparator.comparingInt(String::length));

            if (najdluzsze_slowo.isPresent()) {
                System.out.println("Najdłuższy wyraz: " + najdluzsze_slowo.get());
            } else {
                System.out.println("Nie można znaleźć najdłuższego wyrazu");
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }

        try (Stream<String> lines = Files.lines(Paths.get(plik))) {
            Optional<String> najakrotsze_slowo = lines.min(Comparator.comparingInt(String::length));

            if (najakrotsze_slowo.isPresent()) {
                System.out.println("Najkrótszy wyraz: " + najakrotsze_slowo.get());
            } else {
                System.out.println("Nie możnaa znaleźć najkrótszego słowa");
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }

    }
}
