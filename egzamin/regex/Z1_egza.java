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

        dopasowanie("a", "Java");
        dopasowanie(".3.*", "s3mantyka");
        dopasowanie("^abc$", "abcd");
    }

}
