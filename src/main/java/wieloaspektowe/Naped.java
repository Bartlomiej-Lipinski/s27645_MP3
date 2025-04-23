package wieloaspektowe;

import java.util.ArrayList;
import java.util.List;

public abstract class Naped {
    private static List<Naped> napedy = new ArrayList<>();
    private int mocSilnika;

    public Naped(int mocSilnika) {
        napedy.add(this);
        this.mocSilnika = mocSilnika;
    }

    public void setMocSilnika(int mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }

    public abstract double iloscKoniMechanicznych();
    public abstract int iloscZuzyciaEnergii();
    public abstract String rodzajNapedu();
    public abstract Pojazd getPojazd();
    public abstract void setPojazd(Pojazd pojazd);
}
