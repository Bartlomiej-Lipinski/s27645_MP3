package Overlapping;

import java.util.Arrays;
import java.util.EnumSet;

public class Doctor {
    private final EnumSet<DoctorType> doctorTypes;
    public Doctor(DoctorType... doctorTypes) {
        this.doctorTypes = EnumSet.noneOf(DoctorType.class);
        this.doctorTypes.addAll(Arrays.asList(doctorTypes));
    }
}
