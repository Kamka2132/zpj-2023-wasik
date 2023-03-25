package lab04;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;


public class Zad1{
       public static void main(String[] args){
        String sciezka = "C:/Users/Lap/zpj-2023-wasik";
        File katalog = new File(sciezka);
        
        File[] subdirectoriesL = getSubdirectoriesL(katalog);
        System.out.println("Wyrazenie lambda: " + Arrays.toString(subdirectoriesL));

        File[] subdirectoriesA = getSubdirectoriesA(katalog);
        System.out.println("Klasa anonimowa: " + Arrays.toString(subdirectoriesA));
    }

    //wyrazenie lambda
    public static File[] getSubdirectoriesL(File katalog)
    {
        File[] podkatalog = katalog.listFiles(plik -> plik.isDirectory());
        return podkatalog;
    }


    //klasa anonimowa
    public static File[] getSubdirectoriesA(File katalog)
    {
        File[] podkatalogi = katalog.listFiles(new FileFilter() 
        {
            @Override
            public boolean accept(File plik)
            {
                return plik.isDirectory();
            }
        });
        return podkatalogi;
    }
}