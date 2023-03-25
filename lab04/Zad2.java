package lab04;

import java.io.File;
import java.util.Arrays;

public class Zad2{    
    public static void main(String[] args){
        String sciezka = "C:/Users/Lap/zpj-2023-wasik/lab04";
        String fraza = "java";
        File katalog = new File(sciezka);
        File[] pliki = getFilesByExtension(katalog, fraza);
        System.out.println("Pliki z rozszerzeniam .java z katalogu 'zpj-2023-wasik/lab04' : " + Arrays.toString(pliki));
    }
    
    
    public static File[] getFilesByExtension(File katalog, String fraza){
        File[] pliki = katalog.listFiles((kat, nazwa) -> nazwa.endsWith("." + fraza));
        return pliki;
    }
    
}