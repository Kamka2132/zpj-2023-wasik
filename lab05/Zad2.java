package lab05;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Zad2 {
    public static void main(String[] args){

        List<String> slowa = Arrays.asList("deszcz", "słońce", "burza", "wiatr", "grad", "temperatura", "ciśnienie", "mgła");

        AtomicInteger licznik = new AtomicInteger(0);
        List<String> wynik = slowa.stream()
                .filter(s -> {
                    if (s.length() > 4 && licznik.incrementAndGet() == 5) {
                        System.out.println("Wywołanie metody filter dla piątego długiego słowa");
                    }
                    return s.length() > 4;
                })
                .limit(10)
                .peek(s -> System.out.println("Wywołanie metody peek dla słowa " + s))
                .collect(Collectors.toList());
    }
}
