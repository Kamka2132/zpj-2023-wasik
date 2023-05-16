package lab09;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad2 {
    public static void main(String[] args) {
        Stream<Double> strumien = Stream.of(0.5, 1.2, 6.4, 3.4);

        // Obliczanie średniej za pomocą collect i averagingDouble
        double srednia = strumien.collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println("Średnia: " + srednia);
    }
}
