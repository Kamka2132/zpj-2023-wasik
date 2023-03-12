package lab02;

public interface Measurable{

    double getMeasure();

    // objects to tablica obiektow interfejsu Measurable
    // returnuje średnią lub 0 jeśli tab jest pusta
    default double srednia(Measurable[] objects){
        double suma = 0;
        for (Measurable object : objects){
            suma += object.getMeasure();
        }
        if (objects.length > 0){
            return suma / objects.length;
        }
        else{
            return 0;
        }
    }

    // returnuje nazwisko pracownika z najwyższą wypłatą lub komentarz jak tab jest pusta
    default String getLargest(Measurable[] objects) {
        Measurable najwieksza_wyplata = largest(objects);
        if (najwieksza_wyplata == null) {
            return "Nie ma takiego pracownika";
        }
        return "Pracownik z najwyższym wynagrodzeniem: " + najwieksza_wyplata.toString();
    }



    // returnuje obiekt Measurable z najwyższą wypłatą
    static Measurable largest(Measurable[] objects){
        if(objects == null || objects.length == 0){
            return null;
        }
        Measurable najwieksza = objects[0];
        for (int i = 1; i < objects.length; i++){
            if(objects[i].getMeasure() > najwieksza.getMeasure()){
                najwieksza = objects[i];
            }
        }
        return najwieksza;
    }

}