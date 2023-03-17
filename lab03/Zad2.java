package lab03;

public class Zad2 {
    public static void main(String[] args){
        Runnable task1 = () -> System.out.println("Task1 został uruchomiony");
        Runnable task2 = () -> System.out.println("Task2 został uruchomiony");
        Runnable task3 = () -> System.out.println("Task3 został uruchomiony");
        Runnable task4 = () -> System.out.println("Task4 został uruchomiony");

        // zadania wywołane w oddzielnych wątkach
        System.out.println("---- ODDZIELNE WĄTKI ----");
        TaskRunner.runTogether(task1, task2, task3, task4);
        // zadania wywołane w bieżącym wątku
        System.out.println("---- BIEŻĄCY WĄTEK ----");
        TaskRunner.runInOrder(task1, task2, task3, task4);
    }
    
}
