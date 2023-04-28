package lab07;

import java.util.Spliterator;
import java.util.stream.Stream;

public class Zad1 {
    public static <T> boolean isFinite(Stream<T> stream) {
        Spliterator<T>spliterator = stream.spliterator();
        long szacowany_rozmiar = spliterator.estimateSize();
        return szacowany_rozmiar != Long.MAX_VALUE;
    }

    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(2,4,6,8,10);
        boolean isStreamFinite = Zad1.isFinite(stream);
        System.out.println(isStreamFinite);
    }
}

