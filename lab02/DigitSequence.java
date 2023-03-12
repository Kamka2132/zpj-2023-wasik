package lab02;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private int cyfra;

    public DigitSequence(int x){
        cyfra = x;
    }

    public boolean hasNext(){
        return cyfra > 0;
    }

    public Integer next(){
        int liczba = cyfra % 10;
        cyfra /= 10;
        return liczba;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
