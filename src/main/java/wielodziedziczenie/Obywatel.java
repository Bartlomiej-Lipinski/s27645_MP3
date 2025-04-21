package wielodziedziczenie;

public abstract class Obywatel {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String plec;
    private String adres;
    private String pesel;
    private String numerDowoduOsobistego;

    public Obywatel(String imie, String nazwisko, int wiek, String plec, String adres, String pesel, String numerDowoduOsobistego) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.adres = adres;
        this.pesel = pesel;
        this.numerDowoduOsobistego = numerDowoduOsobistego;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public String getPlec() {
        return plec;
    }
    public String getAdres() {
        return adres;
    }
    public String getPesel() {
        return pesel;
    }
    public String getNumerDowoduOsobistego() {
        return numerDowoduOsobistego;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void setPlec(String plec) {
        this.plec = plec;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public void setNumerDowoduOsobistego(String numerDowoduOsobistego) {
        this.numerDowoduOsobistego = numerDowoduOsobistego;
    }

}
