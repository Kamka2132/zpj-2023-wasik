package lab03;

public class Zad1 {
    public static void main(String[] args){
        Greeter greeter1 = new Greeter(2, "Kamila");
        Greeter greeter2 = new Greeter(4, "Agencie Kamimiadze!!");

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.start();
        thread2.start();
    
    }
}
