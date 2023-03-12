package lab02;

import java.math.BigInteger;

public class SquareSequence implements Sequence <BigInteger> {
    private BigInteger obecny = BigInteger.ZERO;

    public boolean czyNastepny(){
        return true;
    }

    public BigInteger nastepny(){
        obecny = obecny.add(BigInteger.ONE);
        return obecny.multiply(obecny);
    }
}
