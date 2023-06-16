package lab12;

import java.time.LocalTime;

public class TimeInterval {
    private LocalTime czas_start;
    private LocalTime czas_koniec;

    // konstruktor
    public TimeInterval(LocalTime czas_start, LocalTime czas_koniec) {
        this.czas_start = czas_start;
        this.czas_koniec = czas_koniec;
    }

    public LocalTime getCzasStart() {
        return czas_start;
    }

    public LocalTime getCzasKoniec() {
        return czas_koniec;
    }

    // dlugosc odcinka czasu w minutach
    public long getDługoscOdcinkaCzasuWMinutach() {
        return czas_start.until(czas_koniec, java.time.temporal.ChronoUnit.MINUTES);
    }

    public boolean czyNachodziNaSiebie(TimeInterval otherInterval) {
        return !(this.czas_koniec.isBefore(otherInterval.czas_start)
                || this.czas_start.isAfter(otherInterval.czas_koniec));
    }

}
