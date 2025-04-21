package wielodziedziczenie;

public class Posel extends Osoba implements IPosel{

    public Posel(String imie, String nazwisko, int wiek, String plec, String adres, String pesel, String numerDowoduOsobistego, String adresKorespondencyjny, String numerTelefonu, int numerKontaBankowego) {
        super(imie, nazwisko, wiek, plec, adres, pesel, numerDowoduOsobistego, adresKorespondencyjny, numerTelefonu, numerKontaBankowego);
    }

    @Override
    public String getPartia() {
        return "";
    }

    @Override
    public String getOkregWyborczy() {
        return "";
    }

    @Override
    public String getNumerLegitymacji() {
        return "";
    }
}
