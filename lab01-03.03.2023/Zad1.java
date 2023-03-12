package lab01;

class Zad1 {
    public static <T extends Comparable<T>> T min(T... wartosc) {
      if (wartosc == null || wartosc.length == 0) {
          throw new IllegalArgumentException("Wartość nie może przyjmować wartości null");
      }
      T min = wartosc[0];
      for (int i = 1; i < wartosc.length; i++) {
          if (wartosc[i].compareTo(min) < 0) {
              min = wartosc[i];
          }
      }
      return min;
}

    public static <T extends Comparable<T>> T max(T... wartosc){
      if ( wartosc == null || wartosc.length == 0) {
        throw new IllegalArgumentException("Wartość nie może przyjmować wartość null");
      }
      T max = wartosc[0];
      for (int i = 1; i < wartosc.length; i++){
        if ( wartosc[i].compareTo(max) > 0 ) {
          max = wartosc[i];
        }
      }
      return max;
      
    }

  public static void main(String[] args){

      Wymierna wymierna1 = new Wymierna(2,8);
      Wymierna wymierna2 = new Wymierna(4,5);

      Wymierna[] wymierne = new Wymierna[] {wymierna1, wymierna2};

      Wymierna minWymierna = min(wymierne);
      Wymierna maxWymierna = max(wymierne);

      System.out.println("Min Wymierna: " + minWymierna);
      System.out.println("Max Wymierna: " + maxWymierna);


      Zespolona zespolona1 = new Zespolona(5,3);
      Zespolona zespolona2 = new Zespolona(2,8);

      Zespolona[] zespolone = new Zespolona[] {zespolona1, zespolona2};

      Zespolona minZespolona = min(zespolone);
      Zespolona maxZespolona = max(zespolone);

      System.out.println("Min Zespolona: " + minZespolona);
      System.out.println("Max Zespolona: " + maxZespolona);


      Punkt punkt1 = new Punkt(-3, 8);
      Punkt punkt2 = new Punkt(2, 6);

      Punkt[] punkty = new Punkt[] {punkt1, punkt2};

      Punkt minPunkt = min(punkty);
      Punkt maxPunkt = max(punkty);

      System.out.println("Min Punkt: " + minPunkt);
      System.out.println("Max Punkt: " + maxPunkt);

  }
}