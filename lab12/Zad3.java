package lab12;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

public class Zad3 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(id_strefy -> {
                    ZoneRules zasady_strefy = ZoneId.of(id_strefy).getRules();
                    Instant teraz = Instant.now();
                    ZonedDateTime currentDateTime = teraz.atZone(zasady_strefy.getOffset(teraz));
                    return !zasady_strefy.isFixedOffset()
                            && zasady_strefy.getDaylightSavings(currentDateTime.toInstant()) != null;
                })
                .forEach(System.out::println);
    }
}
