package overlapping;

import java.util.Arrays;
import java.util.EnumSet;

public class Doctor {
    private String name;
    private String surname;
    private String pesel;
    private int licenceNumber;
    private final EnumSet<DoctorType> doctorTypes;
    private int ilsocPacjentow;
    private int iloscChorychPacjentow;
    private int iloscWyleczonychPacjentow;
    private int iloscOperacji;
    private int iloscUdanychOperacji;
    private int iloscNieudanychOperacji;
    private int iloscPOZ;
    private int dlugoscDyzuru;

    public Doctor(String name, String surname, String pesel, int licenceNumber) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.licenceNumber = licenceNumber;
        this.doctorTypes = EnumSet.noneOf(DoctorType.class);
    }

    public Doctor(String name, String surname, String pesel, int licenceNumber,DoctorType... doctorTypes) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.licenceNumber = licenceNumber;
        this.doctorTypes = EnumSet.noneOf(DoctorType.class);
        this.doctorTypes.addAll(Arrays.asList(doctorTypes));
    }
    public Double obliczProccentChorychPacjentow() {
        if (doctorTypes.contains(DoctorType.KARDIOLOG)){
            if (ilsocPacjentow == 0) {
                return 0.0;
            }
            return (double) iloscChorychPacjentow / ilsocPacjentow * 100;
        }else {
            throw new IllegalArgumentException("Doctor nie jest kardiologiem");
        }
    }
    public Double obliczSzansePowodzenia() {
        if (doctorTypes.contains(DoctorType.CHIRURG)) {
            if (iloscOperacji == 0) {
                return 0.0;
            }
            return (double) iloscUdanychOperacji / iloscOperacji * 100;
        } else {
            throw new IllegalArgumentException("Doctor nie jest chirurgiem");
        }
    }
    public int obliczDlugoscZmiany() {
        if (doctorTypes.contains(DoctorType.INTERNISTA)) {
            return dlugoscDyzuru*iloscPOZ;
        } else {
            throw new IllegalArgumentException("Doctor nie jest lekarzem POZ");
        }
    }

    public EnumSet<DoctorType> getDoctorTypes() {
        return doctorTypes;
    }
    public boolean isDoctorType(DoctorType doctorType) {
        return doctorTypes.contains(doctorType);
    }
    public boolean isDoctorType(DoctorType... doctorTypes) {
        return this.doctorTypes.containsAll(Arrays.asList(doctorTypes));
    }
    public boolean isDoctorType(EnumSet<DoctorType> doctorTypes) {
        return this.doctorTypes.containsAll(doctorTypes);
    }
    public void addDoctorType(DoctorType doctorType) {
        this.doctorTypes.add(doctorType);
    }
}
