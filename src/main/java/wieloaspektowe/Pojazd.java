package wieloaspektowe;

import java.util.Objects;

public abstract class Pojazd {
    private INaped naped;
    private String marka;
    private String model;
    private int rokProdukcji;
    private String kolor;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pojazd pojazd = (Pojazd) o;
        return rokProdukcji == pojazd.rokProdukcji && Objects.equals(naped, pojazd.naped) && Objects.equals(marka, pojazd.marka) && Objects.equals(model, pojazd.model) && Objects.equals(kolor, pojazd.kolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naped, marka, model, rokProdukcji, kolor);
    }

    public Pojazd(String marka, String model, int rokProdukcji, String kolor) {
        setMarka(marka);
        setModel(model);
        setRokProdukcji(rokProdukcji);
        setKolor(kolor);
    }
    public INaped getNaped() {
        return naped;
    }
    public INaped setNaped(INaped naped) {
        if (naped == null) {
            throw new IllegalArgumentException("Naped nie może być null");
        }
        this.naped = naped;
        return this.naped;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        if (marka == null || marka.isEmpty()) {
            throw new IllegalArgumentException("Marka nie może być null lub pusta");
        }
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model nie może być null lub pusty");
        }
         this.model = model;
    }
    public int getRokProdukcji() {
        return rokProdukcji;
    }
    public void setRokProdukcji(int rokProdukcji) {
        if (rokProdukcji < 1886) {
            throw new IllegalArgumentException("Rok produkcji musi być większy niż 1886");
        }
        this.rokProdukcji = rokProdukcji;
    }
    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        if (kolor == null || kolor.isEmpty()) {
            throw new IllegalArgumentException("Kolor nie może być null lub pusty");
        }
        this.kolor = kolor;
    }
}
