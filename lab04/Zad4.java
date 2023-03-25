package lab04;

public class Zad4{
    public static void main(String[] args){

        Runnable[] runnable = { 
            () -> System.out.println("Jeden arbuz"), 
            () -> System.out.println("Dwa arbuzy"), 
            () -> System.out.println("Trzy pomidory")
        };
        Runnable poczatkowyRunnable = wykonaneRunnable(runnable);
        poczatkowyRunnable.run();

    }

    public static Runnable wykonaneRunnable(Runnable[] runnable){
        return () -> {
            for (Runnable x : runnable) {
                //run wykonuje kolejno kod instancji obiektow zapisanych w tab.
                x.run();
            }
        };
    }
    

}