package wieloaspektowe;

public class Spalinowy extends Naped {
    private final int pojemnoscSilnika;
    private final int iloscCylindrow;
    private final int iloscZaworow;

    public Spalinowy(int mocSilnika, int pojemnoscSilnika, int iloscCylindrow, int iloscZaworow) {
        super(mocSilnika);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscCylindrow = iloscCylindrow;
        this.iloscZaworow = iloscZaworow;
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
}
