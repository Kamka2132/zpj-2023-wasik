package kolokwium;

import java.util.NoSuchElementException;

public class Zad1 implements Mylterator {
    private String[] elementy;
    private int indeks;

    public Zad1(String[] elementy) {
        this.elementy = elementy;
        this.indeks = 0;
    }

    @Override
    public char getNext() {
        if (hasNext()) {
            char nextElement = elementy[indeks].charAt(0);
            indeks++;
            return nextElement;
        }
        throw new NoSuchElementException("Błąd");
    }

    @Override
    public char getPrevious() {
        if (hasPrevious()) {
            char previousElement = elementy[indeks - 1].charAt(0);
            indeks--;
            return previousElement;
        }
        throw new NoSuchElementException("Błąd");
    }

    @Override
    public boolean hasPrevious() {
        return indeks > 0;
    }

    @Override
    public boolean hasNext() {
        return indeks < elementy.length;
    }

    public static void main(String[] args) {
        String[] array = { "Kamila", "informatyka", "opona", "drzewo" };
        Zad1 iterator = new Zad1(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }

        System.out.println();

        while (iterator.hasPrevious()) {
            System.out.println(iterator.getPrevious());
        }
    }
}