// USTAWEINIE STREFY CZASOWEJ

package egzamin.API;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Zad7 {
    public static void main(String[] args) {
        // Pobranie bieżącej daty i czasu
        Date biezacaData = new Date();

        // Ustawienie strefy czasowej na Francję
        TimeZone francja_strefaCzasowa = TimeZone.getTimeZone("Europe/Paris");
        TimeZone.setDefault(francja_strefaCzasowa);

        // Ustawienie lokalizacji na Francję
        Locale francja_lokalizacja = Locale.FRANCE;
        Locale.setDefault(francja_lokalizacja);

        // Formatowanie dla Francji
        DateFormat francja_dataFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat francja_czasFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
        String francja_sformatowanaData = francja_dataFormat.format(biezacaData);
        String francja_sformatowanyCzas = francja_czasFormat.format(biezacaData);

        System.out.println("Data we Francji: " + francja_sformatowanaData);
        System.out.println("Czas we Francji: " + francja_sformatowanyCzas);
    }
}
