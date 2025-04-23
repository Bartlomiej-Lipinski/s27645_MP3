package wieloaspektowe;

public abstract class Pojazd {
    private Naped naped;
    private String marka;
    private String model;
    private int rokProdukcji;
    private String kolor;

    public Pojazd(Naped naped, String marka, String model, int rokProdukcji, String kolor) {
        this.naped = naped;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.kolor = kolor;
    }
    public Naped getNaped() {
        return naped;
    }
    public void setNaped(Naped naped) {
        this.naped = naped;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getRokProdukcji() {
        return rokProdukcji;
    }
    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
