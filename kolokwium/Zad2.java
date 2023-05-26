package kolokwium;

import java.util.stream.Stream;

public class Zad2 {
    public static Stream<Integer> ciag_geometryczny(int x, int y) {
        return Stream.iterate(x, n -> n * y);
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        Stream<Integer> ciag_geometryczny_strumien = ciag_geometryczny(x, y);

        ciag_geometryczny_strumien.forEach(System.out::println);
    }
}
