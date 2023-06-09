package lab11;

import java.time.LocalDate;

public class Zad2 {
    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2000, 2, 29);
        System.out.println("DATA: " + data);

        LocalDate dataA = data.plusYears(1);
        System.out.println("A) jeden rok  -> " + dataA);

        LocalDate dataB = data.plusYears(4);
        System.out.println("B) cztery lata  -> " + dataB);

        LocalDate dataC = data;
        for (int i = 0; i < 4; i++) {
            dataC = dataC.plusYears(1);
        }
        System.out.println("C) cztery razy jeden rok  -> " + dataC);

    }

}
