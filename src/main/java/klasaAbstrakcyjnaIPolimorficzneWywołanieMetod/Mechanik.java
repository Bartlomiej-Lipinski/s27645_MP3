package klasaAbstrakcyjnaIPolimorficzneWywołanieMetod;

public class Mechanik extends Pracownik{
    private String specjalizacja;
    private int stazPracy;

    public Mechanik(String imie, String nazwisko, int wiek, int pensja, String specjalizacja, int stazPracy) {
        super(imie, nazwisko, wiek, pensja);
        this.specjalizacja = specjalizacja;
        this.stazPracy = stazPracy;
    }

    @Override
    public double obliczPensje(int iloscGodzin) {
        double pensja = 0;
        pensja = (stazPracy*0.2)+(pensja/iloscGodzin);
        if (specjalizacja != null) {
            pensja += 0.3  * pensja;
        }
        return pensja;
    }
}
