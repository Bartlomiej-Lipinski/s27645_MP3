package wieloaspektowe;

public class Spalinowy implements INaped {
    private final int mocSilnika;
    private final int pojemnoscSilnika;
    private final int iloscCylindrow;
    private final int iloscZaworow;

    public Spalinowy(int mocSilnika, int pojemnoscSilnika, int iloscCylindrow, int iloscZaworow) {
        this.mocSilnika = mocSilnika;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscCylindrow = iloscCylindrow;
        this.iloscZaworow = iloscZaworow;
    }


    @Override
    public double iloscKoniMechanicznych() {
        return pojemnoscSilnika * 0.13 * iloscCylindrow * iloscZaworow+ mocSilnika * 0.1;
    }

    @Override
    public int iloscZuzyciaEnergii() {
        return pojemnoscSilnika * iloscCylindrow / mocSilnika;
    }

    @Override
    public String rodzajNapedu() {
        return this.getClass().getName();
    }
}
