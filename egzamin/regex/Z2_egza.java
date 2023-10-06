package egzamin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z2_egza {

    public static void znajdzSlowo(String input) {
        System.out.println("Wszystkie 'słowa' zawierające 'z', ale nie na początku ani na końcu 'słowa':");

        Pattern pattern = Pattern.compile("\\b\\w+z\\w+\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println();
    }

    public static void znajdzPodlancuch(String input) {
        System.out.println(
                "Wszystkie podłańcuchy zawierające tylko wielkie litery, małe litery, cyfry i znaki podkreślenia:");

        Pattern pattern = Pattern.compile("[A-Za-z0-9_]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String input = "To jest testowy lancuch zawierajacy slowa z roznymi podlancuchami. "
                + "ZawieraZ, abc_z, 123z456, 789Z, _abc_, zzz, A_B_C, ZABC, XYZ123.";

        znajdzSlowo(input);
        znajdzPodlancuch(input);
    }
}
