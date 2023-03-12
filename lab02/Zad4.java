package lab02;

public class Zad4 {
    public static void main(String args[]){

        IntSequence sekwencja = IntSequence.of(2, 3, 5, 6, 12);
        System.out.println(sekwencja.toString());

        int[] wartosci = sekwencja.getSequence();
        for (int wartosc : wartosci ){
            System.out.println(wartosc + " ");
        }
        System.out.println("-----Zad5-----");
        System.out.println(IntSequence.constant(2));
    }
}
