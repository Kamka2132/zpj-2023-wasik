package lab12;

import java.time.LocalTime;

public class Zad1 {
    public static void main(String[] args) {
        TimeInterval meet1 = new TimeInterval(LocalTime.of(10, 0), LocalTime.of(11, 0));
        TimeInterval meet2 = new TimeInterval(LocalTime.of(9, 30), LocalTime.of(10, 15));
        TimeInterval meet3 = new TimeInterval(LocalTime.of(14, 30), LocalTime.of(15, 0));

        System.out.println("Czas trwania 1 spotkania: " + meet1.getDługoscOdcinkaCzasuWMinutach() + "min.");
        System.out.println("Czas trwania 2 spotkania: " + meet2.getDługoscOdcinkaCzasuWMinutach() + "min.");
        System.out.println("Czas trwania 3 spotkania: " + meet3.getDługoscOdcinkaCzasuWMinutach() + "min.");

        System.out.println("Spotkanie 1 pokrywa się z spotkaniem 2: " + meet1.czyNachodziNaSiebie(meet2));
        System.out.println("Spotkanie 1 pokrywa się z spotkaniem 3: " + meet1.czyNachodziNaSiebie(meet3));

    }
}
