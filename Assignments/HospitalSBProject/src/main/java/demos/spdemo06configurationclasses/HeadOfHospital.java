package demos.spdemo06configurationclasses;

public class HeadOfHospital {
    Doctor doctor;

    public HeadOfHospital(Doctor doctor){
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "HeadOfHospital{" +
                "doctor=" + doctor +
                '}';
    }
}
