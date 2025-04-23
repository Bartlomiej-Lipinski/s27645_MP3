package overlapping;

import java.util.Arrays;
import java.util.EnumSet;

public class Doctor {
    private String name;
    private String surname;
    private int pesel;
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

    public Doctor(String name, String surname, int pesel, int licenceNumber) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.licenceNumber = licenceNumber;
        this.doctorTypes = EnumSet.noneOf(DoctorType.class);
    }

    public Doctor(String name, String surname, int pesel, int licenceNumber,DoctorType... doctorTypes) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        this.surname = surname;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        if (String.valueOf(pesel).length() != 11) {
            throw new IllegalArgumentException("Pesel must be 11 digits long");
        }
        this.pesel = pesel;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        if (String.valueOf(licenceNumber).length() != 7) {
            throw new IllegalArgumentException("Licence number must be 7 digits long");
        }
        this.licenceNumber = licenceNumber;
    }

    public int getIlsocPacjentow() {
        return ilsocPacjentow;
    }

    public void setIlsocPacjentow(int ilsocPacjentow) {
        this.ilsocPacjentow = ilsocPacjentow;
    }

    public int getIloscChorychPacjentow() {
        return iloscChorychPacjentow;
    }

    public void setIloscChorychPacjentow(int iloscChorychPacjentow) {
        this.iloscChorychPacjentow = iloscChorychPacjentow;
    }

    public int getIloscWyleczonychPacjentow() {
        return iloscWyleczonychPacjentow;
    }

    public void setIloscWyleczonychPacjentow(int iloscWyleczonychPacjentow) {
        this.iloscWyleczonychPacjentow = iloscWyleczonychPacjentow;
    }

    public int getIloscOperacji() {
        return iloscOperacji;
    }

    public void setIloscOperacji(int iloscOperacji) {
        this.iloscOperacji = iloscOperacji;
    }

    public int getIloscUdanychOperacji() {
        return iloscUdanychOperacji;
    }

    public void setIloscUdanychOperacji(int iloscUdanychOperacji) {
        this.iloscUdanychOperacji = iloscUdanychOperacji;
    }

    public int getIloscNieudanychOperacji() {
        return iloscNieudanychOperacji;
    }

    public void setIloscNieudanychOperacji(int iloscNieudanychOperacji) {
        this.iloscNieudanychOperacji = iloscNieudanychOperacji;
    }

    public int getIloscPOZ() {
        return iloscPOZ;
    }

    public void setIloscPOZ(int iloscPOZ) {
        this.iloscPOZ = iloscPOZ;
    }

    public int getDlugoscDyzuru() {
        return dlugoscDyzuru;
    }

    public void setDlugoscDyzuru(int dlugoscDyzuru) {
        this.dlugoscDyzuru = dlugoscDyzuru;
    }
}
