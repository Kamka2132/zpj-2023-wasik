package lab6;


public class Zad2 {
    public static void main(String[] args){

        String slowo1 = "Kamila";
        String slowo2 = "456";
        String id1 = "MojeImie";
        String id2 = "5cyfra";
    
        // Testowanie metody czyNapis
        System.out.println(czyNapis(slowo1)); // true
        System.out.println(czyNapis(slowo2)); // false
    
        // Testowanie metody czyJavaID
        System.out.println(czyJavaID(id1)); // true
        System.out.println(czyJavaID(id2)); // false

    }

    public static boolean czyNapis(String s){
        return s.codePoints().allMatch(Character::isAlphabetic);
    }

    public static boolean czyJavaID(String s) {
        if (s.isEmpty() || !Character.isJavaIdentifierStart(s.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isJavaIdentifierPart(s.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }
    
}
