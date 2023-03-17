package lab03;

public class Greeter implements Runnable{
    private int n;
    private String target;

    public Greeter(int n, String target){
        this.n = n;
        this.target = target;

    }

    public void run(){
        for( int i = 0; i <= n; i++){
            System.out.println("Witaj, " + target);
        }
    }

    public String toString(){
        return "Witaj, " + target;
    }
}