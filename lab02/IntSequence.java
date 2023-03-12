package lab02;

public class IntSequence {
    private static int[] sekwencja;

    private IntSequence(int[] sekwencja){
        this.sekwencja = sekwencja;
    }

    public static IntSequence of (int... wartosci){
        return new IntSequence(wartosci);
    }

        // wewnetrzna klasa anonimowa
    // public static IntSequence of (int... wartosci) {
    //     return new IntSequence (new int[] {wartosci}) {
    //         public int suma() {
    //             int suma = 0;
    //             for (int i = 0; i < sekwencja.length; i++) {
    //                 suma += sekwencja[i];
    //             }
    //             return suma;
    //         }
    //     };
    // }

    public int[] getSequence() {
        return sekwencja;
    }

    public String toString(){
        StringBuilder napis = new StringBuilder();
        napis.append("IntSequence -> [");
        for (int i = 0; i < sekwencja.length; i++){
            napis.append(sekwencja[i]);
            if ( i < sekwencja.length - 1){
                napis.append(", ");
            }
        }
        napis.append("]");
        return napis.toString();
    }

    // ZAD 5
    public static IntSequence constant(int liczba){
        while(true){
            System.out.println(liczba);
        }
    }

    
    
}
