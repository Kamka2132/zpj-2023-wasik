package lab09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad5 {
    public static void main(String[] args) {
        List<Integer> liczby = Arrays.asList(2, 3, 2, 6, 1, 3, 3, 3, 2, 5, 6, 7);

        List<Integer> unikalne_liczby = liczby.parallelStream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Oryginalne liczby: " + liczby);
        System.out.println("Unikalne liczby: " + unikalne_liczby);
    }
}
