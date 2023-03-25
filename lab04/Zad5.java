package lab04;

import java.util.Arrays;
import java.util.Comparator;


public class Zad5{
    public static void main(String[] args){
        Employee[] pracownicy = {
            new Employee("Konrad Wietrzny", 3600),
            new Employee("Lolita Huragan", 4100),
            new Employee("Tomek Słoneczny", 5500),
            new Employee("Jola Deszczowa", 4800),
            new Employee("Sławek Burzowy", 6300),
            new Employee("Antoni Pochmurny", 4800),
            new Employee("Dominika Chłodna", 6300)
    };


    System.out.println("Przed sortowaniem: ");
    for (Employee prac : pracownicy) {
        System.out.println(prac);
    }

    Comparator<Employee> odWynagrodzeniaDoImienia = Comparator.comparingDouble(Employee::getWynagrodzenie).thenComparing(Employee::getImie);

    Arrays.sort(pracownicy, odWynagrodzeniaDoImienia);
    System.out.println("Sortowanie według wynagrodzenia, później według nazwiska: ");
    for (Employee prac : pracownicy) {
        System.out.println(prac);
    }

    Comparator<Employee> odWynagrodzeniaDoImienia_ODWROCONE = odWynagrodzeniaDoImienia.reversed();
    Arrays.sort(pracownicy, odWynagrodzeniaDoImienia_ODWROCONE);
    System.out.println("Odwrócona kolejność: ");
    for (Employee prac : pracownicy) {
        System.out.println(prac);
    }

    }
}
