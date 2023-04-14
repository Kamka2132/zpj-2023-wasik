package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zad1{
    public static void main(String[] args){
        String wejscie = "Ala ma kota";
        Stream<String> codePointsStream = codePointsIntStream(wejscie);
        codePointsStream.forEach(System.out::println);

    }

    //metoda ze slajdu 4
    public static Stream<String> codePoints(String s){
        List<String> wynik = new ArrayList<>();
        int i = 0;

        while(i < s.length()){
            int j = s.offsetByCodePoints(i, 1);
            wynik.add(s.substring(i, j)); 
            i = j;
        }
        return wynik.stream();
    }


    /** poprawiona metoda aby korzystała z IntStream.iterate
       IntStream.iterate tworzy skonczony strumien offsetow(poczatkowa wartosc 0), 
       nastepnie zwieksza sie o 1
       s.substring - wyodrębnienie podłańcucha 
    */

    public static Stream<String> codePointsIntStream(String s){
        return IntStream.iterate(0, i -> i < s.length(), i -> s.offsetByCodePoints(i,1))
        .mapToObj(i -> s.substring(i, s.offsetByCodePoints(i,1)));
    }
}
