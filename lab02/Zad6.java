package lab02;

import java.math.BigInteger;

public class Zad6 {
    public static void main(String[] args){
        Sequence<BigInteger> sekwencja = new SquareSequence();

        for (int i = 0; i < 5; i++){
            System.out.println(i + "^2 = " + sekwencja.nastepny());
        }

    }
}
