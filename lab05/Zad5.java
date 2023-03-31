package lab05;

import java.util.stream.Stream;

public class Zad5 {
    public static Stream<Long> generatorLCG(long a, long c, long m, long ziarno) {
        return Stream.iterate(ziarno, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = 248L;
        long ziarno = 12345L;

        Stream<Long> strumien = generatorLCG(a, c, m, ziarno);

        strumien.limit(10).forEach(System.out::println);
    }
}
