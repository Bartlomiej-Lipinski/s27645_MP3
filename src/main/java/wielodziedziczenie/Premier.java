package wielodziedziczenie;

import java.time.LocalDate;

public class Premier extends Obywatel implements IPosel{
    private LocalDate dataObjeciaStanowiska;
    private LocalDate dataUstapieniaZStanowiska;
    private int numerKadencji;

    public Premier(String imie, String nazwisko, int wiek, String plec, String adres, String pesel, String numerDowoduOsobistego) {
        super(imie, nazwisko, wiek, plec, adres, pesel, numerDowoduOsobistego);
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
