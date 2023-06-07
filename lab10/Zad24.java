package lab10;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.regex.*;

public class Zad24 {
    public static void main(String[] args) {
        try {
            // wpisz adres strony w linii polecen albo pobierz domyslny
            String urlString;
            if (args.length > 0) {
                urlString = args[0];
            } else {
                urlString = "https://www.ujd.edu.pl";
            }

            InputStreamReader in = new InputStreamReader(
                    new URL(urlString).openStream(),
                    StandardCharsets.UTF_8);

            StringBuilder input = new StringBuilder();
            int ch;
            while ((ch = in.read()) != -1) {
                input.append((char) ch);
            }
            // znajdz wszystkie dopasowania
            String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>]*)\\s*>";
            Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String match = matcher.group();
                // sprawdz jesli link pasuje z plikiem .jpg
                if (match.toLowerCase().contains(".jpg")) {
                    String fileName = extractFileName(match);
                    System.out.println(fileName);
                }
            }
        } catch (IOException | PatternSyntaxException e) {
            e.printStackTrace();
        }
    }

    private static String extractFileName(String link) {
        String fileName = "";
        int startIndex = link.lastIndexOf("/");
        if (startIndex != -1 && startIndex < link.length() - 1) {
            fileName = link.substring(startIndex + 1);
        }
        return fileName;
    }
}