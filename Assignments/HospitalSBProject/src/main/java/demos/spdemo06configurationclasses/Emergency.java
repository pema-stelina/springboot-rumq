package demos.spdemo06configurationclasses;

public class Emergency {
    private Doctor doctor;

    public Emergency(Doctor doctor){
        this.doctor=doctor;
    }

    @Override
    public String toString() {
        return "Emergency{" +
                "doctor=" + doctor +
                '}';
    }
}
