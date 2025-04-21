package klasaAbstrakcyjnaIPolimorficzneWywołanieMetod;

public abstract class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int pensja;

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public abstract double obliczPensje(int iloscGodzin);

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie ='" + imie + '\'' +
                ", nazwisko ='" + nazwisko + '\'' +
                ", wiek =" + wiek +
                ", pensja =" + pensja +
                '}';
    }

}
