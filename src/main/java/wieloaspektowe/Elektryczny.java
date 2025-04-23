package wieloaspektowe;

public class Elektryczny extends Naped {
    private final int iloscSilnikow;
    private final int pojemnoscAkumulatora;

    public Elektryczny(int pojemnoscAkumulatora, int mocSilnika, int iloscSilnikow) {
        super(mocSilnika);
        this.iloscSilnikow = iloscSilnikow;
        this.pojemnoscAkumulatora = pojemnoscAkumulatora;
    }

    @Override
    public double iloscKoniMechanicznych() {
        return super.getMocSilnika() * 1.34 * iloscSilnikow;
    }

    @Override
    public int iloscZuzyciaEnergii() {
        return super.getMocSilnika()*iloscSilnikow / pojemnoscAkumulatora;
    }

    @Override
    public String rodzajNapedu() {
        return this.getClass().getName();
    }
}
