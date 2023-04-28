package lab07;

import java.util.OptionalDouble;
import java.util.stream.Stream;


// Jezeli strumien bedzie mial wewenetrzna implementace z wykorzytsaniem iteratora
// to iterator moze nie wiedziec ile elementow pozostalo do przetworzenia
// w strumieniu dlatego count() moze zwrocic niepoprawna wartosc



public class Zad4 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(2.0, 4.0, 6.0, 8.0, 10.0);
        OptionalDouble srednia = stream
                .mapToDouble(Double::doubleValue).reduce((a, b) -> (a + b) / 2);
        System.out.println(srednia.getAsDouble());
    }
}

