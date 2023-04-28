package lab07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Zad3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 12, 13));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(21, 22, 23));

        // reduce z jednym argumentem
        Stream<ArrayList<Integer>> strumien_list = Stream.of(list1, list2, list3);
        List<Integer> kombinacja_list2 = strumien_list
                .reduce((l1, l2) -> {
                    ArrayList<Integer> nowa_lista = new ArrayList<>(l1);
                    nowa_lista.addAll(l2);
                    return nowa_lista;
                }).orElse(new ArrayList<>());
        System.out.println("Połączone listy (reduce z jednym argumentem): " + kombinacja_list2);

        // reduce z dwoma argumentami
        List<Integer> kombinacja_list1 = Stream.of(list1, list2, list3)
                .reduce(new ArrayList<>(), (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
        System.out.println("Połączone listy (reduce z dwoma argumentami): " + kombinacja_list1);

        // reduce z trzema argumentami
        Stream<ArrayList<Integer>> strumien_list2 = Stream.of(list1, list2, list3);
        ArrayList<Integer> identity = new ArrayList<>();
        List<Integer> kombinacja_list3 = strumien_list2
                .reduce(identity,
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        },
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        });
        System.out.println("Połączone listy (reduce z trzema argumentami): " + kombinacja_list3);
    }
}
