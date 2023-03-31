package lab05;

import java.util.Random;

public class Zad1 {
    private static Random generator = new Random();

    public static IntSequence randomInts(int min, int max) {
        class RandomSequence implements IntSequence {
            public int next() {
                return min + generator.nextInt(max - min + 1);
            }
            public boolean hasNext(){ 
                return true; 
            }
        }
        return new RandomSequence();
    }

    private interface IntSequence {
        int next();
        boolean hasNext();
    }

    
    public static void main(String[] args){
        IntSequence sequence = Zad1.randomInts(1, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(sequence.next());
        }
    }

}
