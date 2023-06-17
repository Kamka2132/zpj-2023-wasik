package lab13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Zad1 {
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

        // Ustawienie strefy czasowej na Chiny
        TimeZone chiny_strefaCzasowa = TimeZone.getTimeZone("Asia/Shanghai");
        TimeZone.setDefault(chiny_strefaCzasowa);

        // Ustawienie lokalizacji na Chiny
        Locale chiny_lokalizacja = Locale.CHINA;
        Locale.setDefault(chiny_lokalizacja);

        // Formatowanie dla Chin
        DateFormat chiny_dataFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat chiny_czasFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
        String chiny_sformatowanaData = chiny_dataFormat.format(biezacaData);
        String chiny_sformatowanyCzas = chiny_czasFormat.format(biezacaData);

        System.out.println("Data w Chinach: " + chiny_sformatowanaData);
        System.out.println("Czas w Chinach: " + chiny_sformatowanyCzas);

        // Ustawienie strefy czasowej na Tajlandię
        TimeZone tajlandia_strefaCzasowa = TimeZone.getTimeZone("Asia/Bangkok");
        TimeZone.setDefault(tajlandia_strefaCzasowa);

        // Ustawienie lokalizacji na Tajlandię
        Locale tajlandia_lokalizacja = new Locale("th", "TH");
        Locale.setDefault(tajlandia_lokalizacja);

        // Formatowanie dla Tajlandii z cyframi tajskimi
        SimpleDateFormat tajlandia_dataFormat = new SimpleDateFormat("EEEE d MMMM yyyy", tajlandia_lokalizacja);
        DateFormat tajlandia_czasFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
        String tajlandia_sformatowanaData = tajlandia_dataFormat.format(biezacaData);
        String tajlandia_sformatowanyCzas = tajlandia_czasFormat.format(biezacaData);

        System.out.println("Data w Tajlandii: " + tajlandia_sformatowanaData);
        System.out.println("Czas w Tajlandii: " + tajlandia_sformatowanyCzas);
    }
}
