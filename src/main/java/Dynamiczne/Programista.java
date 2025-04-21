package Dynamiczne;

public abstract class Programista {
    protected String imie;
    protected String nazwisko;
    protected int wiek;
    protected int pensja;
    protected String jezykProgramowania;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" + imie + " " + nazwisko + ", wiek: " + wiek +" jezyk programowania: " + jezykProgramowania;
    }
}
