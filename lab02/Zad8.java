package lab02;

import java.util.ArrayList;
import java.util.Comparator;

public class Zad8 {
    public static void main(String[] args){

        ArrayList<String> strings = new ArrayList<>();
        strings.add("marchewka");
        strings.add("ogórek");
        strings.add("pomidor");
        strings.add("cukinia");
        strings.add("kalafior");

        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        };

        System.out.println("PRZED: " + strings);
        
        LuckySort.luckySort(strings, comp);
        System.out.println("PO: " + strings);
    }
}
