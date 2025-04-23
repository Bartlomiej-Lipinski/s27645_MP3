package wieloaspektowe;

public class Spalinowy extends Naped {
    private final int pojemnoscSilnika;
    private final int iloscCylindrow;
    private final int iloscZaworow;
    private Pojazd pojazd;

    private Spalinowy(int mocSilnika, int pojemnoscSilnika, int iloscCylindrow, int iloscZaworow) {
        super(mocSilnika);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscCylindrow = iloscCylindrow;
        this.iloscZaworow = iloscZaworow;
    }
    public static void createSpalinowy(int mocSilnika, int pojemnoscSilnika, int iloscCylindrow, int iloscZaworow, Pojazd pojazd) {
        Spalinowy spalinowy = new Spalinowy(mocSilnika, pojemnoscSilnika, iloscCylindrow, iloscZaworow);
        spalinowy.setPojazd(pojazd);
        Naped naped = pojazd.setNaped(spalinowy);
        if (naped != spalinowy){
            throw new IllegalArgumentException("Nie można ustawić napędu");
        }
        if (spalinowy.getPojazd() != pojazd) {
            throw new IllegalArgumentException("Nie można ustawić pojazdu");
        }
    }

    public void setPojazd(Pojazd pojazd) {
        if (pojazd == null) {
            throw new IllegalArgumentException("Pojazd nie może być null");
        }
        this.pojazd = pojazd;
    }


    @Override
    public double iloscKoniMechanicznych() {
        return pojemnoscSilnika * 0.13 * iloscCylindrow * iloscZaworow+ super.getMocSilnika() * 0.1;
    }

    @Override
    public int iloscZuzyciaEnergii() {
        return pojemnoscSilnika * iloscCylindrow / super.getMocSilnika();
    }

    @Override
    public String rodzajNapedu() {
        return this.getClass().getName();
    }

    @Override
    public Pojazd getPojazd() {
        return pojazd;
    }
}
