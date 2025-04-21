package Wielodziedziczenie;

import java.time.LocalDate;

public class JanKowalski implements Obywatel,Posel,Premier{
    private String imie;
    private String nazwisko;
    private int wiek;
    private String plec;
    private String adres;
    private String pesel;
    private String numerDowoduOsobistego;

    public JanKowalski(String imie, String nazwisko, int wiek, String plec, String adres, String pesel, String numerDowoduOsobistego) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.adres = adres;
        this.pesel = pesel;
        this.numerDowoduOsobistego = numerDowoduOsobistego;
    }

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    @Override
    public String getPlec() {
        return plec;
    }

    @Override
    public String getAdres() {
        return adres;
    }

    @Override
    public String getPesel() {
        return pesel;
    }

    @Override
    public String getNumerDowoduOsobistego() {
        return numerDowoduOsobistego;
    }

    @Override
    public String getNumerTelefonu() {
        return "";
    }

    @Override
    public String getEmail() {
        return "";
    }

    @Override
    public String getZawod() {
        return "";
    }

    @Override
    public String getWyksztalcenie() {
        return "";
    }

    @Override
    public String getStanCywilny() {
        return "";
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

    @Override
    public LocalDate getDataObjeciaStanowiska() {
        return null;
    }

    @Override
    public LocalDate getDataUstapieniaZeStanowiska() {
        return null;
    }

    @Override
    public int getNumerKadencji() {
        return 0;
    }
}
