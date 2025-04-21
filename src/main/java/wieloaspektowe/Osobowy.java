package wieloaspektowe;

public class Osobowy extends Pojazd{
    private int iloscMiejsc;
    private String typNadwozia;
    private String typNapedu;


    public Osobowy(INaped naped, String marka, String model, int rokProdukcji, String kolor,int iloscMiejsc, String typNadwozia) {
        super(naped, marka, model, rokProdukcji, kolor);
        this.iloscMiejsc =iloscMiejsc;
        this.typNadwozia = typNadwozia;
        this.typNadwozia = naped.rodzajNapedu();
    }
    public int getIloscMiejsc() {
        return iloscMiejsc;
    }
    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }
    public String getTypNadwozia() {
        return typNadwozia;
    }
    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }
    public String getTypNapedu() {
        return typNapedu;
    }
    public void setTypNapedu(String typNapedu) {
        this.typNapedu = typNapedu;
    }

    @Override
    public String toString() {
        return "Osobowy{" +
                "naped=" + getNaped() +
                ", marka='" + getMarka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", rokProdukcji=" + getRokProdukcji() +
                ", kolor='" + getKolor() + '\'' +
                '}';
    }

}
