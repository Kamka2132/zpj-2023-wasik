package lab04;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Zad3{
    public static void main(String[] args){
        String sciezka = "C:/Users/Lap/zpj-2023-wasik";
        File katalog = new File(sciezka);

        //tablica plików znajdujących się w katalogu
        File[] pliki = katalog.listFiles();

        //thenComapring, getName - porownanie plikow wg nazw
        Arrays.sort(pliki, Comparator.comparing(File::isDirectory).reversed().thenComparing(File::getName));
        System.out.println(Arrays.toString(pliki));

    }
}
