package wieloaspektowe;

public abstract class Naped {
    private int mocSilnika;

    public Naped(int mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }

    public void setMocSilnika(int mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public abstract double iloscKoniMechanicznych();
    public abstract int iloscZuzyciaEnergii();
    public abstract String rodzajNapedu();
}
