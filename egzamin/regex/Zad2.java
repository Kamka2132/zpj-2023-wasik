// ZNAJDUJE DOPASOWANIE (JEDNO LUB WIELE) W PODANYM STRINGU 
// I WYPISUJE JAKO STR, LISTA LUB INT

package egzamin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad2 {
    public static void main(String[] args) {
        String regex = "[+-]?\\d+";

        CharSequence input = "-123";
        if (Pattern.matches(regex, input)) {
            System.out.println(input + " jest liczbą całkowitą");
        }

        Pattern pattern = Pattern.compile(regex);
        input = "Fred";
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            System.out.println(input + " nie jest liczbą całkowitą");
        }

        Stream<String> strings = Stream.of("10 butelek leży na stole, a obok są 2 krzesła i 1 dywan".split(" "));
        Stream<String> result = strings.filter(pattern.asPredicate());
        System.out.println(result.collect(Collectors.toList()));

        input = "lipiec 14, 2012";
        matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }
}
