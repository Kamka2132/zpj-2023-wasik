package lab05;

import java.util.stream.IntStream;

public class Zad4 {
    public static void main(String[] args){

        int[] wartosci = {1, 4, 9, 16};
        IntStream strumien = IntStream.of(wartosci);
     
        strumien.forEach(element -> System.out.println(element));
        // strumien.forEach(System.out::println);
    }

// WYJAŚNIENIE ZADANIA
//      Stream.of(wartosci) utworzy strumień, kóry będzie składał się 
//      z elementów tablicy typu <Integer>
//      aby uzyskać strumień wartości typu int trzeba użyć metody IntStream.of
}
