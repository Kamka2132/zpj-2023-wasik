package lab02;

public class Zad7 {
    public static void main(String[] args){
        DigitSequence sekwencja_digit = new DigitSequence(12345);

        while(sekwencja_digit.hasNext()){
            int cyfra = sekwencja_digit.next();
            System.out.print(cyfra + " ");
        }
    }
}
