package dynamiczne;

import java.util.Map;
import static dynamiczne.PajsonataType.*;

public class Pasjonata {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String jezykProgramowania;
    private String ulubionySystemOperacyjny;
    private String rodzajModeli;
    private String opisZbieranejNacji;
    private Map<String,Double> pieniadzeWydaneNaGre;
    private String ulubionaPlatforma;
    private Enum<PajsonataType> pajsonataType;

    public Pasjonata(String imie, String nazwisko, int wiek, String jezykProgramowania, Enum<PajsonataType> pajsonataType) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.jezykProgramowania = jezykProgramowania;
        this.pajsonataType = pajsonataType;
    }
    public void changePajsonataType(Enum<PajsonataType> pajsonataType) {
        if (pajsonataType == null) {
            throw new IllegalArgumentException("PajsonataType cannot be null");
        }
        this.pajsonataType = pajsonataType;
        switch (pajsonataType) {
            case INFORMATYK -> {
                this.jezykProgramowania = null;
                this.ulubionySystemOperacyjny = null;
            }
            case MODELARZ -> {
                this.rodzajModeli = null;
                this.opisZbieranejNacji = null;
            }
            case GRACZ -> {
                this.pieniadzeWydaneNaGre = null;
                this.ulubionaPlatforma = null;
            }
            default -> throw new IllegalStateException("Unexpected value: " + pajsonataType);
        }

    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }

    public Enum<PajsonataType> getPajsonataType() {
        return pajsonataType;
    }
    public String getJezykProgramowania() {
        if (pajsonataType.equals(INFORMATYK)) {
            return jezykProgramowania;
        }else {
            throw new IllegalArgumentException("Pasjonata nie jest informatykiem");
        }
    }
    public void setImie(String imie) {
        if (imie == null) {
            throw new IllegalArgumentException("Imie cannot be null");
        }
        if (imie.isEmpty()) {
            throw new IllegalArgumentException("Imie cannot be empty");
        }
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        if (nazwisko == null) {
            throw new IllegalArgumentException("Nazwisko cannot be null");
        }
        if (nazwisko.isEmpty()) {
            throw new IllegalArgumentException("Nazwisko cannot be empty");
        }
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek) {
        if (wiek < 0) {
            throw new IllegalArgumentException("Wiek cannot be negative");
        }
        this.wiek = wiek;
    }
    public void setJezykProgramowania(String jezykProgramowania) {
        if (jezykProgramowania == null) {
            throw new IllegalArgumentException("Jezyk programowania cannot be null");
        }
        if (pajsonataType.equals(INFORMATYK)) {
        this.jezykProgramowania = jezykProgramowania;
        }else {
            throw new IllegalArgumentException("Pasjonata nie jest informatykiem");
        }
    }
    public void setPajsonataType(Enum<PajsonataType> pajsonataType) {
        if (pajsonataType == null) {
            throw new IllegalArgumentException("PajsonataType cannot be null");
        }
        this.pajsonataType = pajsonataType;
    }
    public String getUlubionySystemOperacyjny() {
        if (pajsonataType.equals(INFORMATYK)) {
            return ulubionySystemOperacyjny;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest informatykiem");
        }
    }
    public void setUlubionySystemOperacyjny(String ulubionySystemOperacyjny) {
        if (ulubionySystemOperacyjny == null) {
            throw new IllegalArgumentException("Ulubiony system operacyjny cannot be null");
        }
        if (pajsonataType.equals(INFORMATYK)) {
            this.ulubionySystemOperacyjny = ulubionySystemOperacyjny;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest informatykiem");
        }
    }
    public String getRodzajModeli() {
        if (pajsonataType.equals(MODELARZ)) {
            return rodzajModeli;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest modelarzem");
        }
    }
    public void setRodzajModeli(String rodzajModeli) {
        if (rodzajModeli == null) {
            throw new IllegalArgumentException("Rodzaj modeli cannot be null");
        }
        if (pajsonataType.equals(MODELARZ)) {
            this.rodzajModeli = rodzajModeli;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest modelarzem");
        }
    }
    public String getOpisZbieranejNacji() {
        if (pajsonataType.equals(MODELARZ)) {
            return opisZbieranejNacji;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest modelarzem");
        }
    }
    public void setOpisZbieranejNacji(String opisZbieranejNacji) {
        if (opisZbieranejNacji == null) {
            throw new IllegalArgumentException("Opis zbieranej nacji cannot be null");
        }
        if (pajsonataType.equals(MODELARZ)) {
            this.opisZbieranejNacji = opisZbieranejNacji;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest modelarzem");
        }
    }
    public Map<String, Double> getPieniadzeWydaneNaGre() {
        if (pajsonataType.equals(GRACZ)) {
            return pieniadzeWydaneNaGre;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest graczem");
        }
    }
    public Double getPieniadzeWydaneNaGre(String gra) {
        if (pieniadzeWydaneNaGre == null) {
            throw new IllegalArgumentException("Pieniądze wydane na grę cannot be null");
        }
        if (pajsonataType.equals(GRACZ)) {
            return pieniadzeWydaneNaGre.get(gra);
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest graczem");
        }
    }
    public void addPieniadzeWydaneNaGre(String gra, Double pieniadze) {
        if (pieniadze == null) {
            throw new IllegalArgumentException("Pieniądze wydane na grę cannot be null");
        }
        if (pajsonataType.equals(GRACZ)) {
            this.pieniadzeWydaneNaGre.put(gra, pieniadze);
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest graczem");
        }
    }
    public void setPieniadzeWydaneNaGre(Map<String, Double> pieniadzeWydaneNaGre) {
        if (pieniadzeWydaneNaGre == null) {
            throw new IllegalArgumentException("Pieniądze wydane na grę cannot be null");
        }
        if (pajsonataType.equals(GRACZ)) {
            this.pieniadzeWydaneNaGre = pieniadzeWydaneNaGre;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest graczem");
        }
    }
    public String getUlubionaPlatforma() {
        if (pajsonataType.equals(GRACZ)) {
            return ulubionaPlatforma;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest graczem");
        }
    }
    public void setUlubionaPlatforma(String ulubionaPlatforma) {
        if (ulubionaPlatforma == null) {
            throw new IllegalArgumentException("Ulubiona platforma cannot be null");
        }
        if (pajsonataType.equals(GRACZ)) {
            this.ulubionaPlatforma = ulubionaPlatforma;
        } else {
            throw new IllegalArgumentException("Pasjonata nie jest graczem");
        }
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" + imie + " " + nazwisko + ", wiek: " + wiek +" jezyk programowania: " + jezykProgramowania;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasjonata)) return false;
        Pasjonata pasjonata = (Pasjonata) o;
        return wiek == pasjonata.wiek && imie.equals(pasjonata.imie) && nazwisko.equals(pasjonata.nazwisko);
    }
    @Override
    public int hashCode() {
        return 31 * imie.hashCode() + 31 * nazwisko.hashCode() + wiek;
    }
}
