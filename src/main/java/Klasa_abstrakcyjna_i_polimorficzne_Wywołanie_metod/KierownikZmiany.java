package Klasa_abstrakcyjna_i_polimorficzne_Wywołanie_metod;

public class KierownikZmiany extends Pracownik{
    private String zmiana;
    private int iloscPracownikow;
    private int iloscZlecen;
    private int iloscZlecenWykonanych;
    private int iloscZlecenNieWykonanych;

    public KierownikZmiany(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);
    }

    @Override
    public double obliczPensje(int iloscGodzin) {
        double pensja = 0;
        pensja = (iloscPracownikow*0.1)+(pensja/iloscGodzin)+((iloscZlecenWykonanych/iloscZlecen)*0.2)-((iloscZlecenNieWykonanych/iloscZlecen)*0.3);

        return pensja;
    }

    public String getZmiana() {
        return zmiana;
    }

    public void setZmiana(String zmiana) {
        if (zmiana == null || zmiana.isEmpty()) {
            throw new IllegalArgumentException("Zmiana nie może być pusta");
        }

        this.zmiana = zmiana;
    }

    public int getIloscPracownikow() {
        return iloscPracownikow;
    }

    public void setIloscPracownikow(int iloscPracownikow) {
        if (iloscPracownikow < 0) {
            throw new IllegalArgumentException("Ilość pracowników nie może być ujemna");
        }

        this.iloscPracownikow = iloscPracownikow;
    }

    public int getIloscZlecen() {
        return iloscZlecen;
    }

    public void setIloscZlecen(int iloscZlecen) {
        if (iloscZlecen < 0) {
            throw new IllegalArgumentException("Ilość zleceń nie może być ujemna");
        }
        this.iloscZlecen = iloscZlecen;
    }

    public int getIloscZlecenWykonanych() {
        return iloscZlecenWykonanych;
    }

    public void setIloscZlecenWykonanych(int iloscZlecenWykonanych) {
        if (iloscZlecenWykonanych < 0) {
            throw new IllegalArgumentException("Ilość zleceń wykonanych nie może być ujemna");
        }
        if (iloscZlecenWykonanych > iloscZlecen) {
            throw new IllegalArgumentException("Ilość zleceń wykonanych nie może być większa niż ilość zleceń");
        }
        if (iloscZlecenWykonanych + iloscZlecenNieWykonanych > iloscZlecen) {
            throw new IllegalArgumentException("Suma zleceń wykonanych i niewykonanych nie może być większa niż ilość zleceń");
        }

        this.iloscZlecenWykonanych = iloscZlecenWykonanych;
    }

    public int getIloscZlecenNieWykonanych() {
        return iloscZlecenNieWykonanych;
    }

    public void setIloscZlecenNieWykonanych(int iloscZlecenNieWykonanych) {
        if (iloscZlecenNieWykonanych < 0) {
            throw new IllegalArgumentException("Ilość zleceń niewykonanych nie może być ujemna");
        }
        if (iloscZlecenNieWykonanych > iloscZlecen) {
            throw new IllegalArgumentException("Ilość zleceń niewykonanych nie może być większa niż ilość zleceń");
        }
        if (iloscZlecenNieWykonanych + iloscZlecenWykonanych > iloscZlecen) {
            throw new IllegalArgumentException("Suma zleceń wykonanych i niewykonanych nie może być większa niż ilość zleceń");
        }
        this.iloscZlecenNieWykonanych = iloscZlecenNieWykonanych;
    }
}
