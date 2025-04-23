package wieloaspektowe;

public class Elektryczny extends Naped {
    private final int iloscSilnikow;
    private final int pojemnoscAkumulatora;
    Pojazd pojazd;

    private Elektryczny(int pojemnoscAkumulatora, int mocSilnika, int iloscSilnikow) {
        super(mocSilnika);
        this.iloscSilnikow = iloscSilnikow;
        this.pojemnoscAkumulatora = pojemnoscAkumulatora;
    }
    public static void createElektryczny(int pojemnoscAkumulatora, int mocSilnika, int iloscSilnikow, Pojazd pojazd) {
        Elektryczny elektryczny = new Elektryczny(pojemnoscAkumulatora, mocSilnika, iloscSilnikow);
        elektryczny.setPojazd(pojazd);
        Naped naped = pojazd.setNaped(elektryczny);
        if (naped != elektryczny){
            throw new IllegalArgumentException("Nie można ustawić napędu");
        }
        if (elektryczny.getPojazd() != pojazd) {
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
        return getMocSilnika() * 1.34 * iloscSilnikow;
    }

    @Override
    public int iloscZuzyciaEnergii() {
        return getMocSilnika()*iloscSilnikow / pojemnoscAkumulatora;
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
