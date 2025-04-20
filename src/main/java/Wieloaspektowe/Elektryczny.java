package Wieloaspektowe;

public class Elektryczny implements INaped {
    private final int mocSilnika;
    private final int iloscSilnikow;
    private final int pojemnoscAkumulatora;

    public Elektryczny(int pojemnoscAkumulatora, int mocSilnika, int iloscSilnikow) {
        this.mocSilnika = mocSilnika;
        this.iloscSilnikow = iloscSilnikow;
        this.pojemnoscAkumulatora = pojemnoscAkumulatora;
    }

    @Override
    public double iloscKoniMechanicznych() {
        return mocSilnika * 1.34 * iloscSilnikow;
    }

    @Override
    public int iloscZuzyciaEnergii() {
        return mocSilnika*iloscSilnikow / pojemnoscAkumulatora;
    }

    @Override
    public String rodzajNapedu() {
        return this.getClass().getName();
    }
}
