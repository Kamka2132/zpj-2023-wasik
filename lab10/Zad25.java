package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad25 {
    public static void main(String[] args) {

        System.out.println("A) METODA FIND ");
        String input = "Lorem ipsum 321 dolor -21 sit 369 amet";
        String regex = "-?\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<Integer> integers = new ArrayList<>();
        // dodawanie elementow do listy
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            integers.add(number);
        }
        // wyluskanie elementow z listy na osobne elementy
        for (int number : integers) {
            System.out.println(number);
        }

        System.out.println("B) METODA SPLIT ");
        String input2 = "Lorem ipsum 321 dolor -21 sit 369 amet";

        String[] numbers = input2.split("\\s+");

        List<Integer> integers2 = new ArrayList<>();
        for (String number : numbers) {
            if (number.matches("-?\\d+")) {
                int num = Integer.parseInt(number);
                integers2.add(num);
            }
        }

        for (int number : integers2) {
            System.out.println(number);
        }
    }
}
