package lab05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Zad3 {

    private static final int dlugosc_slowa = 15;

    public static void main(String[] args) throws IOException {

        // Wczytanie tekstu z pliku
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("war_and_peace.txt"))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                sb.append(linia).append(" ");
            }
        }
        String tekst = sb.toString();

        // Pomiar czasu dla Stream
        long czas_start = System.currentTimeMillis();

        AtomicInteger stream = new AtomicInteger(0);
        StringTokenizer st = new StringTokenizer(tekst);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.length() > dlugosc_slowa) {
                stream.incrementAndGet();
            }
        }

        long koniec_czasu = System.currentTimeMillis();

        System.out.println("STREAM -> liczba słów: " + stream.get());
        System.out.println("Czas wykonania: " + (koniec_czasu - czas_start) + " ms");

        // Pomiar czasu dla ParallelStream
        czas_start = System.currentTimeMillis();

        AtomicInteger parallel = new AtomicInteger(0);
        st = new StringTokenizer(tekst);
        Stream.generate(st::nextToken)
                .limit(st.countTokens())
                .parallel()
                .filter(slowo -> slowo.length() > dlugosc_slowa)
                .forEach(slowo -> parallel.incrementAndGet());

        koniec_czasu = System.currentTimeMillis();

        System.out.println("");
        System.out.println("PARALLELSTREAM -> liczba słów: " + parallel.get());
        System.out.println("Czas wykonania: " + (koniec_czasu - czas_start) + " ms");
    }
}
