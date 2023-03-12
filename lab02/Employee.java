package lab02;

public class Employee implements Measurable {
    
    private String imie;
    private double wynagrodzenie;

    public Employee(String imie, double wynagrodzenie){
        this.imie = imie;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String toString(){
        return imie;
    }

    @Override
    public double getMeasure(){
        return wynagrodzenie;
    }

    public String getName(){
        return imie;
    }

}