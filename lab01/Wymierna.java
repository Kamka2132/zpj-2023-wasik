package lab01;

import java.util.Scanner;

public class Wymierna implements Comparable<Wymierna>{
    private int licznik;
    private int mianownik;

    private int l;
    private int m;


    Scanner sc = new Scanner(System.in);
    
    public Wymierna(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public String toString() {
        if (mianownik == 1) {
            return String.valueOf(l);
        } else {
            return licznik + "/" + mianownik;
        }
    }

    public void wypiszCalosci(){
        int c = licznik / mianownik;
        int nowy_licznik = licznik - (c * mianownik);
        System.out.println("CAŁOŚCI  " + c + " " + nowy_licznik + "/" + mianownik);
    }

    public void nwd(){
        int licznik_nwd = licznik;
        int mianownik_nwd = mianownik;
        while (licznik_nwd != mianownik_nwd){
            if (licznik_nwd > mianownik_nwd){
                licznik_nwd = licznik_nwd - mianownik_nwd;
                //System.out.println("licznik WYNOSI: " + licznik);

                //System.out.println("NWD WYNOSI: " + licznik_nwd);
            }
            else {
                mianownik_nwd = mianownik_nwd - licznik_nwd;
            }
        }
        System.out.println("NWD WYNOSI: " + licznik_nwd);

    }

    public void skracanieUlamka(){
        int a = 2;
        int licznik_skrocony = licznik;
        int mianownik_skrocony = mianownik;
        do {
            if (licznik_skrocony % a == 0 && mianownik_skrocony % a == 0){
                licznik_skrocony = licznik_skrocony / a;
                mianownik_skrocony = mianownik_skrocony / a;
                a--;
            }
            a++;

        } while(a < mianownik_skrocony && a < licznik_skrocony);
        System.out.println("SKRÓCONY UŁAMEK:  " + licznik_skrocony + "/" + mianownik_skrocony);

    }

    

    public void dodawanie(){
        System.out.println("-------------------DODAWANIE---------------------------");

        int wspolny_mianownik = mianownik * m;
        int licznik_dodawania1 = licznik * m;
        int licznik_dodawania2 = l * mianownik;
        int wynik_l = (licznik_dodawania1+licznik_dodawania2);

        System.out.println(licznik_dodawania1 + "/" + wspolny_mianownik + " + " + licznik_dodawania2 + "/" + wspolny_mianownik + " = " + wynik_l + "/" + wspolny_mianownik);
    }


    public void odejmowanie(){
        System.out.println("");
        System.out.println("-------------------ODEJMOWANIE---------------------------");

        int wspolny_mianownik = mianownik * m;
        int licznik1 = licznik * m;
        int licznik2 = l * mianownik;
        int wynik_l = (licznik1-licznik2);

        System.out.println(licznik1 + "/" + wspolny_mianownik + " - " + licznik2 + "/" + wspolny_mianownik + " = " + wynik_l + "/" + wspolny_mianownik);
    }

    public void mnozenie(){
        System.out.println("");
        System.out.println("-------------------MNOŻENIE---------------------------");

        int wynik_l = licznik * l;
        int wynik_m = mianownik * m;

        System.out.println(licznik + "/" + mianownik + " * " + l + "/" + m + " = " + wynik_l + "/" + wynik_m);
    }

    public void dzielenie(){
        System.out.println("");
        System.out.println("-------------------DZIELENIE---------------------------");

        int wynik_licznik = licznik * m;
        int wynik_mianownik = mianownik * l;
        
        System.out.println(licznik + "/" + mianownik + " / " + l + "/" + m + " = " + wynik_licznik + "/" + wynik_mianownik);

    }

    public int compareTo(Wymierna other) {
        int wynik1 = this.licznik * other.mianownik;
        int wynik2 = other.licznik * this.mianownik;

        if(wynik1 < wynik2)
        {
            return -1;
        }
        else if(wynik1 > wynik2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }



}