package lab6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String input = sc.nextLine();

        List<String> najdluzszy_podlancuch = new ArrayList<>();
        int max_dlugosc = 0;

        for(int i = 0; i < input.length(); i++){
            for(int j = i + 1; j <= input.length(); j++){
                String podlancuch = input.substring(i, j);
                int dlugosc = podlancuch.length();
                if ( dlugosc > max_dlugosc){
                    najdluzszy_podlancuch.clear();
                    najdluzszy_podlancuch.add(podlancuch);
                    max_dlugosc = dlugosc;
                }
                else if ( dlugosc == max_dlugosc ){
                    najdluzszy_podlancuch.add(podlancuch);
                }
            }
        }
        System.out.printf("Najdłuższy ciąg znaków to %s%n", najdluzszy_podlancuch);

        sc.close();

    }

}