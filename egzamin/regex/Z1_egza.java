package egzamin.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Z1_egza {
    public static void dopasowanie(String regex, String input) {
        System.out.println("regex: " + regex);
        System.out.println("input: " + input);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Znalezione dopasowania:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();
    }

    public static void main(String[] args) {

        dopasowanie("[a-zA-Z0-9]+", "J4va");
        dopasowanie("a[b]*", "ab aba abbc");
        dopasowanie("a[b]+", "abba aba");
        dopasowanie("abbb", "abbba abba ab");
        dopasowanie("a[b]{2,3}", "abba ab");
        dopasowanie("[a-z]+_[a-z]+", "sala_szkola uczelnia_dom");
        dopasowanie("[A-Z][a-z]+", "Kamila lubi Placki");
        dopasowanie("a.*b", "arab ma barany");
        dopasowanie("\\barbuz\\b", "arbuz jest owocem. arbuz jest slodki");
        dopasowanie("[a-zA-Z]+[,.;:-?!]*$", "Kamila je owoce?!");

    }

}
