package lab02;

public class Zad1 {
    public static void main(String[] args)
    {
        //tablica z pracownikami
        Measurable[] objects = {
                new Employee("Tomek Słoneczny", 5500),
                new Employee("Jola Deszczowa", 4800),
                new Employee("Sławek Burzowy", 6300)
	    };

        double srednieWynagrodzenie = objects[0].srednia(objects);

        //zaokraglenie 0.00
        double srednieWynagr = Math.round(srednieWynagrodzenie * 100.0) / 100.0;
        System.out.println("Srednie wynagrodzenie pracownikow to: " + srednieWynagr);

        //zad2
        String najwieksza = objects[0].getLargest(objects);
        System.out.println(najwieksza);
    }
}