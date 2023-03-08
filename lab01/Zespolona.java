package lab01;

public class Zespolona implements Comparable<Zespolona> {
    
    private int x;
    private int y;


    public Zespolona(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        if (y >= 0) {
            return x + "+" + y + "i";
        } else {
            return x + "-" + Math.abs(y) + "i";
        }
    }

    public void wypiszLiczbeZespolona(int x, int y, int x2, int y2){
        //System.out.println("LICZBA ZESPOLONA");
        System.out.println("Zespolona1:  " + x + " + " + y + "i");
        System.out.println("Zespolona2:  " + x2 + " + " + y2 + "i");


    }

    public void dodawanie(int x, int x2, int y, int y2){
        int wynik_x = x + x2;
        int wynik_y = y + y2;

        System.out.println(x + " + " + y + "i" + " + " + x2 + " + " + y2 + "i" + " = " + wynik_x + wynik_y + "i");
    }

    public void odejmowanie(int x, int x2, int y, int y2){
        int odejmowanie_x = x - x2;
        int odejmowanie_y = y - y2;

        System.out.println(x + " + " + y + "i" + " - (" + x2 + " + " + y2 + "i)" + " = " + odejmowanie_x + "+" + odejmowanie_y + "i");
    }

    public void mnozenie(int x, int x2, int y, int y2){
        int wyn1 = x * x2;
        int wyn2 = x * y2; //i
        int wyn3 = y * x2;
        int wyn4 = (y * y2) * -1; //i^2 = -1

        int wynik_x = wyn1 + wyn4;
        int wynik_yi = wyn2 + wyn3;

        System.out.println(x + " + " + y + "i" + " * " + x2 + " + " + y2 + "i" + " = " + wynik_x + wynik_yi + "i");

    }

    public int compareTo(Zespolona other) {
        double mod1 = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        double mod2 = Math.sqrt(Math.pow(other.x, 2) + Math.pow(other.y, 2));
        if (mod1 < mod2) {
            return -1;
        } else if (mod1 > mod2) {
            return 1;
        } else {
            return 0;
        }
    }


}