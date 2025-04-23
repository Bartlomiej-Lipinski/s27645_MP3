import wieloaspektowe.*;
import wielodziedziczenie.*;
public class Main {
    public static void main(String[] args) {
        // Tworzenie pojazdu osobowego

        Osobowy osobowy = new Osobowy("Toyota", "Corolla", 2020, "Czarny", 5, "Sedan");
        // Tworzenie napędu spalinowego
        Elektryczny.createElektryczny(123, 150, 2, osobowy);
        System.out.println(osobowy.getNaped());
        Spalinowy.createSpalinowy(200, 1600, 4, 16, osobowy);
        System.out.println(osobowy.getNaped());



    }
}
