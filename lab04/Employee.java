package lab04;

public class Employee {   
    private String imie;
    private double wynagrodzenie;
    
    public Employee(String imie, double wynagrodzenie) {
        this.imie = imie;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getImie() {
        return imie;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    @Override
    public String toString() {
        return imie + " (" + wynagrodzenie + ")";
    }

}
