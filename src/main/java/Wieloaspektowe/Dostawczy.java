package Wieloaspektowe;

public class Dostawczy implements IPrzeznaczenie{
    private String typ;
    private int ladownosc;

    public Dostawczy(String typ, int ladownosc) {
        this.typ = typ;
        this.ladownosc = ladownosc;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(int ladownosc) {
        this.ladownosc = ladownosc;
    }
}
