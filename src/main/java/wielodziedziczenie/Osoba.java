package wielodziedziczenie;

public class Osoba extends Obywatel {
    private String adresKorespondencyjny;
    private String numerTelefonu;
    private int numerKontaBankowego;

    public Osoba(String imie, String nazwisko, int wiek, String plec, String adres, String pesel, String numerDowoduOsobistego, String adresKorespondencyjny, String numerTelefonu, int numerKontaBankowego) {
        super(imie, nazwisko, wiek, plec, adres, pesel, numerDowoduOsobistego);
        this.adresKorespondencyjny = adresKorespondencyjny;
        this.numerTelefonu = numerTelefonu;
        this.numerKontaBankowego = numerKontaBankowego;
    }

    public String getAdresKorespondencyjny() {
        return adresKorespondencyjny;
    }
    public void setAdresKorespondencyjny(String adresKorespondencyjny) {
        this.adresKorespondencyjny = adresKorespondencyjny;
    }
    public String getNumerTelefonu() {
        return numerTelefonu;
    }
    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }
    public int getNumerKontaBankowego() {
        return numerKontaBankowego;
    }
    public void setNumerKontaBankowego(int numerKontaBankowego) {
        this.numerKontaBankowego = numerKontaBankowego;
    }

}
