package kolokwium;

import java.util.Arrays;
import java.util.Comparator;

public class Zad3 {
    public static void main(String[] args) {
        Integer[] liczby = { 123, 321, 456, 654, 987, 789 };

        Arrays.sort(liczby, Comparator.comparingInt((Integer x) -> x % 10).thenComparingInt(x -> (x / 10) % 10));

        System.out.println("Posortowane liczby:  " + Arrays.toString(liczby));
    }
}